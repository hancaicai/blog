package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.Article;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.ArticleService;
import com.beike.hcc.blog.service.UserService;
import com.beike.hcc.blog.util.EncodeByMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/userLogin")
    public  String  Loginview(){
        return "/userLogin";
    }

    @RequestMapping("/loginConfirm")
    public ModelAndView loginController(HttpServletRequest request,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();

        String name=request.getParameter("name");
        String passWord=request.getParameter("password");
        User user=userService.selectUserByName(name);
        //String pwd=user.getPassWord();
        //String pwd1=EncodeByMd5.encodeByMD5(passWord);
        if(user.getPassWord().equals(EncodeByMd5.encodeByMD5(passWord))){
            session.setAttribute("user",user);
            //session.setAttribute("userName",name);

            modelAndView.setViewName("/index");
            modelAndView.addObject("user",user.getUserName());
            modelAndView.addObject("userId",user.getUserId());
            //Article article =articleService.getArticleListByUserId(21);
            ArrayList<Article> articleList=articleService.getArticleList();
            ArrayList<String> titleList=new ArrayList<String>();
            for(Article article:articleList){
                titleList.add(article.getTitle());
                System.out.print(article.getArticleId());
            }
            modelAndView.addObject("articleList",articleList);
        }
        else{
            modelAndView.setViewName("error");
        }
        return modelAndView;

    }
}
