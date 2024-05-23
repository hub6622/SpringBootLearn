package com.example.springboot_learn.mapper;

import com.example.springboot_learn.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    public List<Article> findAll();
}
