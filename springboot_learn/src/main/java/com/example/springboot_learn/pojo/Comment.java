package com.example.springboot_learn.pojo;

import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer a_id;
}
