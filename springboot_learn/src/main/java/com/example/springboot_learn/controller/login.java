package com.example.springboot_learn.controller;

import com.example.springboot_learn.pojo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {

    @RequestMapping("/login")
    public String User_login(Model model){
        Article article=new Article();
        article.setId(1);
        article.setTitle("挖古瓦不顾");
        article.setContent("瓦达西瓦");
        model.addAttribute("article",article);
        return "login";
    }
}
