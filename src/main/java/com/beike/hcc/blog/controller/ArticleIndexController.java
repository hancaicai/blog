
package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.ArticleService;
import com.beike.hcc.blog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
public class ArticleIndexController {


    @Autowired
    ArticleService articleService;


    @RequestMapping("/article/index")
    public String article(ModelMap modelMap, User user){
        //model.addObject("title","我的博客");
        //model.addAttribute("title","我的博客");

//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("article/index");
//        mv.addObject("title", "我的博客");

        modelMap.addAttribute("title","Redis 实战之主从复制、高可用、分布式");
        modelMap.addAttribute("user","hehehe");
        modelMap.addAttribute("article","通过持久化保证 Redis 在服务器重启的情况下数据也不会丢失。但数据在一台服务器上，如果服务器的硬盘坏了,也会导致数据丢失。为了避免单点故障，Redis 提供了主从复制高可用方案。");


       // ArrayList<Article> articleslist=new ArrayList<Article>(articleService.getArticleListByUserId(userId));

        return "article/index";
    }



}
