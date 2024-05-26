package com.example.springboot_learn.service;

import com.example.springboot_learn.pojo.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();
}
