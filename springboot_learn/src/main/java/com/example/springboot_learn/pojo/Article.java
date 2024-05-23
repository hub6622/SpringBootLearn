package com.example.springboot_learn.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private List<Comment> commentList;
}
