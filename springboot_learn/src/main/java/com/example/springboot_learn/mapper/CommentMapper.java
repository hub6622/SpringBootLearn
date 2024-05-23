package com.example.springboot_learn.mapper;

import com.example.springboot_learn.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id = #{id}")
    public Comment findCommentById(Integer id);
}
