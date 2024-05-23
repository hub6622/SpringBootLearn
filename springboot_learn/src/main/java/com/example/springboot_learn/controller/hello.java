package com.example.springboot_learn.controller;
import com.example.springboot_learn.mapper.ArticleMapper;
import com.example.springboot_learn.pojo.Article;
import com.example.springboot_learn.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class hello {
    @Autowired
    ArticleService service;
    @RequestMapping("/hello")
    public String goodHello(){
        return "/view/hello";
//        return "hello3";
    }
    @RequestMapping("/hello3")
    public String hello3(Model model){
        List<Article> articleList=service.findAll();
        model.addAttribute("articleList",articleList);
        model.addAttribute("wel1","hello3");
        model.addAttribute("wel","<a href='beauty.html'>666</a>");
        return "/hello3";
    }
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Article> articleList=service.findAll();
        model.addAttribute("articleList",articleList);
        return "/articleList";
    }
}
