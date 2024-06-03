package ppg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ppg.demo.pojo.Result;
import ppg.demo.pojo.User;
import ppg.demo.service.UserService;
import ppg.demo.utils.EncodeUtil;

import java.io.File;
import java.io.IOException;

@Controller
public class goodController {
    @Autowired
    UserService userService;

    @RequestMapping("/good")
    @ResponseBody
    public Result getUser(@RequestBody User user){
        return new Result("666","succeed",user);
    }
    @GetMapping("/good1")
    @ResponseBody
    public Result findAll(){
        return new Result("666","succeed",userService.findAll());
    }
    @PostMapping("/good2")
    @ResponseBody
    public Result insertUser(@RequestBody User user){
        userService.insertUser(user);
        return new Result("666","succeed",null);
    }
    @PostMapping("/good3/{id}")
    @ResponseBody
    public Result findById(@PathVariable Integer id){
        return new Result("good3","succeed",userService.findUserById(id));
    }
    @GetMapping("/good4")
    @ResponseBody
    public Result findUserBook(){
        return new Result("good4","succeed",userService.findUserBook());
    }

    @GetMapping("/dcc")
    public String abc(){
        System.out.println("dcc=====");
        return "/dcc6";
    }

    @PostMapping("/upload")
    @ResponseBody
    public Result upload(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()) {
            return new Result("1", "not select file", null);
        }
        try{
            byte[] bytes = file.getBytes();
            String uploadDir = "D:\\";
            File uploadFile = new File(uploadDir + file.getOriginalFilename());
            file.transferTo(uploadFile);
            return new Result("200","succeed",file.getOriginalFilename());
        }catch (IOException e){
            e.printStackTrace();
            return new Result("500","fail",null);
        }
    }

    @GetMapping("/encode/{Pwd}")
    @ResponseBody
    public Result encode(@PathVariable String Pwd){
        EncodeUtil encodeUtil=new EncodeUtil();
        String encodePwd = encodeUtil.Md5Encode(Pwd);
        System.out.println(encodePwd);
        return new Result("200","succeed",encodePwd);
    }
    @GetMapping("/confirm/{Pwd}")
    @ResponseBody
    public Result confirm(@PathVariable String Pwd){
        EncodeUtil encodeUtil=new EncodeUtil();
        System.out.println(encodeUtil.Md5Encode(Pwd));
        if(encodeUtil.Md5Encode(Pwd).equals("d146f9632cb744368153ac9b83c0c974")){

            return new Result("200","succeed",null);
        }
        return new Result("201","error",null);
    }
}
