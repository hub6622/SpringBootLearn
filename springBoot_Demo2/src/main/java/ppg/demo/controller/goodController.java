package ppg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ppg.demo.pojo.Result;
import ppg.demo.pojo.User;
import ppg.demo.service.UserService;
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
}
