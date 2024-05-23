package com.example.springboot_learn.service;

import com.example.springboot_learn.pojo.Article;

import java.util.List;

/**
 * @Author: 肖奕杰
 * @Date: 2024/3/21 10:41
 **/
public interface ArticleService {
    List<Article> findAll();
}
