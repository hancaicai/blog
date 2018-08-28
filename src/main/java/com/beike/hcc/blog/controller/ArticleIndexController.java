package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ArticleIndexController {


    @RequestMapping("Article/index")
    public ModelAndView ArticleIndexController(Model model){
        //article.addAttribute("title",article.getTitle());

        //model.addAttribute("title","hahahahah");
   return  new  ModelAndView("Article/index","title","hahahahah");

    }




}
