package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@RestController
public class ArticleIndexController {

    @RequestMapping("/article/index"); //url访问的域名

    @Autowired
    ArticleServiceImpl articleService;

    public ModelAndView ArticleIndexController(User user){

        Integer userId=user.getUserId();

        ArrayList<Article> articleslist=new ArrayList<Article>(articleService.getArticleListByUserId(userId));

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/article/index");
        modelAndView.addObject("user",user.getUserName());
        for (Article article:articleslist
             ) {
            modelAndView.addObject("title" ,article.getContent());
        }
       // modelAndView.addObject("title",)
        //return  new  ModelAndView("/article/index","title","");  //viewName为访问的template下面的文件
//        return templates/article/index
        return modelAndView;
    }



}
