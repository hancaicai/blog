package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.Comment;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
@Controller
public class CommentController {
    @Autowired
  private   CommentService commentService;



    //评论的添加
    @RequestMapping("commentAdd")
    public ModelAndView commentAdd(Comment comment, HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Date date=new Date();
        Article article=(Article) session.getAttribute("article");
        Integer articleId=article.getArticleId();
        Integer userId=article.getUserId();
        comment.setUserId(userId);
        comment.setArticleId(articleId);
        comment.setCommentPostTime(date);
        commentService.insertComment(comment);
        modelAndView.setViewName("artilce/index");
        return modelAndView;

    }
    //评论的删除
    @RequestMapping("commentDelete")
    public ModelAndView commentDelete(Comment comment,HttpSession session) throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        Integer userId=comment.getUserId();
        Integer commentId=comment.getCommentId();
        User user=(User) session.getAttribute("user");
        if(user.getUserId().equals(userId)){
            commentService.deleteComment(commentId);
            modelAndView.setViewName("artilce/index");
        }
        else{
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

}
