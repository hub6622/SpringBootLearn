package ppg.demo.controller;

import org.springframework.web.bind.annotation.*;
import ppg.demo.pojo.User;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/save")
    public String save(String name,String password){
        System.out.println(name+", "+password);
        return "{'result':'success;}";
    }
    @RequestMapping("/indexSave")
    public User indexSave(@RequestBody User user){
        System.out.println("List user->"+user);
        return user;
    }
    @RequestMapping("/indexSaveJson")
    public String indexSaveJson(@RequestBody Map<String,Object> user){
        System.out.println("List json->"+user);
        return "{'result':'success'}";
    }
}
