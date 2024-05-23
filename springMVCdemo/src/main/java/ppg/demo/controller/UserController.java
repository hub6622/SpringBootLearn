package ppg.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ppg.demo.pojo.User;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    public String save(String name,String password){
        System.out.println(name+", "+password);
        return "{'result':'success;}";
    }
    @PostMapping("/usersave")
    public User user(User user){
        System.out.println(user.toString());
        return user;
    }
    @PostMapping("/usersave1")
    public String user(String[] name){
        System.out.println("user->"+name[2]);
        return "{'result':'success;}";
    }
    @PostMapping("/usersave2")
    public String user(@RequestParam List<String> name){
        System.out.println("user->"+name);
        return "{'result':'success;}";
    }
}
