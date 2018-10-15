package com.beike.hcc.blog.service.impl;

import com.beike.hcc.blog.mapper.ArticleMapper;
import com.beike.hcc.blog.mapper.CommentMapper;
import com.beike.hcc.blog.model.Comment;
import com.beike.hcc.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
     CommentMapper commentMapper;


    //添加评论
    public void insertComment( Comment comment) {
        commentMapper.inserComment(comment);
    }

    //根据文章id获取评论列表
    public List<Comment> getCommentByArticleId(Integer articleId){
        List<Comment> commentList=new ArrayList<Comment>(commentMapper.selectCommentByArticleId(articleId));
        return commentList;
    }

    //根据id获取评论
    public Comment getCommentById(Integer commentId) {
        return commentMapper.selectCommentById(commentId);
    }

    //删除评论
    public void deleteComment(Integer id) {
        commentMapper.deleteCommentById(id);
    }

    //修改评论
    public void updateComment(Comment comment) {
        commentMapper.updateComment(comment);
    }
}
