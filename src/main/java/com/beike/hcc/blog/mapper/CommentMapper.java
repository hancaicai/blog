package com.beike.hcc.blog.mapper;

import com.beike.hcc.blog.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CommentMapper {
    Comment selectCommentById(Integer commentId);
    ArrayList<Comment> selectCommentByArticleId(Integer ArticleId);
    ArrayList<Comment> selectCommentByUserId(Integer ArticleId);
    void deleteCommentById(Integer commentId);
    void deleteCommentByArticleId(Integer ArticleId);
    void deleteCommentByUserId(Integer UserId);
    void inserComment(Comment comment);
    void updateComment(Comment comment);
}
