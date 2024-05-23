package com.example.springboot_learn.service.impl;

import com.example.springboot_learn.mapper.ArticleMapper;
import com.example.springboot_learn.pojo.Article;
import com.example.springboot_learn.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/3/21 10:42
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }
}
