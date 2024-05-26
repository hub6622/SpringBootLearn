package ppg.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ppg.demo.pojo.User;


@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("阿覅哦哈个");
        return "11";
    }
    @RequestMapping("/hello1")
    public String jsonStr(){
        String jsonStr="{'name':'neo','age':30}";
        return jsonStr;
    }
    @RequestMapping("/hello2")
    public String hello2(@RequestParam("name")String username){
        System.out.println("-----");
        System.out.println("username is:"+username);
        return "11";
    }
    @RequestMapping("/hello3")
    public String setParam(User user){
        System.out.println("-----");
        System.out.println("username--->"+user.getUsername());
        System.out.println("age--->"+user.getAge());
        return "11";
    }

}
