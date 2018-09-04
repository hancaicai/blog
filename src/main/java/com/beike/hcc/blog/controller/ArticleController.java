package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.Comment;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.ArticleService;
import com.beike.hcc.blog.service.CommentService;
import com.beike.hcc.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@RequestMapping("/article")
@Slf4j
@Controller  //一定要加原因

public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Autowired
    UserService userService;
    //自己文章的列表
    @RequestMapping("articleIndex")
    public ModelAndView articleIndex(@RequestParam("userId") Integer userId){
        ModelAndView modelAndView=new ModelAndView();
        User user=userService.selectUserById(userId);
        ArrayList<Article> articleList=articleService.getArticleListByUserId(userId);
        modelAndView.setViewName("article/index");
        modelAndView.addObject("user",user.getUserName());
        modelAndView.addObject("articleList",articleList);
        return modelAndView;



    }

    //文章的添加
    @RequestMapping("articleInsert")
    public ModelAndView articleInsert(Article article , HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Date date=new Date();
        User user=(User)session.getAttribute("user");
        Integer userId=user.getUserId();
        //session.getAttribute("name");
        article.setUserId(userId);
        article.setPostTime(date);
        articleService.addArticle(article);
        modelAndView.setViewName("article/search");
        return modelAndView;
    }
    //某一篇文章的浏览
    @RequestMapping("/articleDetail") //url访问的域名

    public ModelAndView articleIndexController(@RequestParam("articleId") Integer articleId, HttpServletRequest request){

        System.out.print(articleId);

        List<Comment> commentList= commentService.getCommentByArticleId(articleId);
        Article article=articleService.getArticle(articleId);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/article/detail");
        modelAndView.addObject("title",article.getTitle());
        modelAndView.addObject("content",article.getContent());
        modelAndView.addObject("commentList",commentList);
        return modelAndView;

    }

    //文章的删除
    @RequestMapping("articleDelete")
    public ModelAndView articleDelete(Article article, HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Integer articleId=article.getArticleId();
        Integer userId=article.getUserId();
        User user=(User) session.getAttribute("user");
        if(user.getUserId().equals(userId)){
            articleService.deleteArticle(articleId);
            modelAndView.setViewName("article/index");
        }else{
            modelAndView.setViewName("error");
        }
        return modelAndView;

    }

   //文章的修改
    @RequestMapping("articleUpdate")
    public ModelAndView articleUpdate(Article article,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Integer articleId=article.getArticleId();
        Integer userId=article.getUserId();
        User user=(User) session.getAttribute("user");
        if(user.getUserId().equals(userId)){
            modelAndView.setViewName("article/update");
            articleService.updateArticle(articleId,article);
        }
        else{
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }

}
