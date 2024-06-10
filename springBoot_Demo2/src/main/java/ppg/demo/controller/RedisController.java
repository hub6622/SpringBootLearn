package ppg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ppg.demo.pojo.Result;
import ppg.demo.service.RedisService;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    RedisService redisService;

    @PostMapping("/addString")
    public Result addString(String key, String value)
    {
        System.out.println(key+value);
        redisService.setValue(key,value);
        return new Result("200","success",null);
    }
    @GetMapping("/getString")
    public Result getString(String key)
    {
        String str = (String) redisService.getValue(key);
        System.out.println(str);
        return new Result("200","success",str);
    }
    @PostMapping("/deleteString")
    public Result deleteString(String key)
    {
        return new Result("200","success",redisService.deleteValue(key));
    }
    @PostMapping("/List")
    public void List()
    {
        redisService.ListRightPush("list","ppg");
        redisService.ListRightPush("list","18");
        redisService.ListRightPush("list","male");
    }
}
