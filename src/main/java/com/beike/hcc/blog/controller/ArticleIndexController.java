package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ArticleIndexController {

    @RequestMapping("/article/index")
    public ModelAndView ArticleIndexController(){
        // model.addObject("title","hahahahah");
         //return "article/index";
        return  new  ModelAndView("/article/index","title","hahahahah");
    }




}
