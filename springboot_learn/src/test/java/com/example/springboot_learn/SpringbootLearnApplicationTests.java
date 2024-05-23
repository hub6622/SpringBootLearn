package com.example.springboot_learn;

import com.example.springboot_learn.mapper.ArticleMapper;
import com.example.springboot_learn.mapper.CommentMapper;
import com.example.springboot_learn.pojo.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootLearnApplicationTests {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    CommentMapper commentMapper;
    @Test
    void contextLoads() {
        List<Article> articles=articleMapper.findAll();
        for (Article a:articles) {
            System.out.println(a);
        }
    }
    @Test
    void hello(){
        System.out.println("hello");
    }
    @Test
    void findCommentById(){
        System.out.println(commentMapper.findCommentById(1));
    }

}
