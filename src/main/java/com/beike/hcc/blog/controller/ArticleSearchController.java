package com.beike.hcc.blog.controller;


import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.Comment;
import com.beike.hcc.blog.service.CommentService;
import com.beike.hcc.blog.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
public class ArticleSearchController {

    @RequestMapping("/article/search"); //url访问的域名

    @Autowired
    CommentServiceImpl commentService;
    public ModelAndView ArticleIndexController(Article article){
        // model.addObject("title","hahahahah");
        //return "article/index";
        Integer articleId= article.getArticleId();
        ArrayList<Comment> commentList= new ArrayList(commentService.getCommentByArticleId(articleId));
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/article/index");
        modelAndView.addObject("title",article.getTitle());
        modelAndView.addObject("article",article);
        for (Comment comment:commentList
             ) {
            modelAndView.addObject("comment",comment.getContent());
        }


          return modelAndView;


    }
}
