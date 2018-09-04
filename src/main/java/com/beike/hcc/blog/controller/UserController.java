package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.ArticleService;
import com.beike.hcc.blog.service.UserService;
import com.beike.hcc.blog.util.EncodeByMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


public class UserController {
    @Autowired
    public ArticleService articleService;
    @Autowired
    public  UserService userService;
    //文章列表
    @RequestMapping("/index")
    public ModelAndView Index(HttpServletRequest request){
        String name=request.getParameter("name");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/index");
        modelAndView.addObject("user",name);
        ArrayList<Article> articleList=articleService.getArticleList();
       /* ArrayList<String> titleList= new ArrayList<String>();
        for(Article article:articleList){
            titleList.add(article.getTitle());
        }*/
         //modelAndView.addAllObjects("articleList",articleList);

        modelAndView.addObject("articleList ",articleList);

        return modelAndView;

    }

 /*   //用户信息的修改
    @RequestMapping("userUpdate")
    public ModelAndView userUpdate(HttpSession session){

    }
    */

    public ModelAndView UserController(HttpServletRequest request){

      String name=request.getParameter("name");

      ModelAndView modelAndView=new ModelAndView();
      modelAndView.setViewName("/index");
      modelAndView.addObject("user",name);

      return modelAndView;
    }





}
