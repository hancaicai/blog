<<<<<<< Updated upstream
package com.beike.hcc.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class ArticleIndexController {

    @RequestMapping("/article/index")
    public String ArticleIndexController(ModelMap modelMap){
        //model.addObject("title","我的博客");
        //model.addAttribute("title","我的博客");

//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("article/index");
//        mv.addObject("title", "我的博客");

        modelMap.addAttribute("title","Redis 实战之主从复制、高可用、分布式");
        modelMap.addAttribute("user","陈煜弘");
        modelMap.addAttribute("article","通过持久化保证 Redis 在服务器重启的情况下数据也不会丢失。但数据在一台服务器上，如果服务器的硬盘坏了,也会导致数据丢失。为了避免单点故障，Redis 提供了主从复制高可用方案。");

        return "article/index";
    }




}
=======
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
>>>>>>> Stashed changes
