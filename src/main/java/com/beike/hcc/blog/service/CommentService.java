package com.beike.hcc.blog.service;

import com.beike.hcc.blog.model.Comment;
import java.util.List;

public interface CommentService {
    //添加评论
    public void insertComment( Comment comment) ;

    //根据文章id获取评论列表
    public List<Comment> listCommentByArticleId(Integer articleId);

    //根据id获取评论
    public Comment getCommentById(Integer commentId) ;

    //删除评论
    public void deleteComment(Integer id) throws Exception;

    //修改评论
    public void updateComment(Comment comment) throws Exception;

    //统计评论数
  //  public Integer countComment(Integer status) throws Exception;

    //获得最近评论
   // public List<Comment> listRecentComment(Integer limit) throws Exception;


    //获取所有评论列表
   // public List<Comment> listCommentByPage(Integer status, Integer pageNow, Integer pageSize) throws Exception;

    //获得评论列表
    //public List<CommentListVo> listCommentVo(Integer status) throws Exception;

    //获得评论列表
   // public List<CommentCustom> listComment(Integer status) throws Exception;


    //获得评论的子评论
    //public List<Comment> listChildComment(Integer id) throws Exception;
}
