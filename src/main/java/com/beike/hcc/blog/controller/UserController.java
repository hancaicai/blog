package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.UserService;
import com.beike.hcc.blog.util.EncodeByMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class UserController {

  public void UserController(){

  }



    @Autowired
    private UserService userService;

    @RequestMapping("/userLogin")
    public ModelAndView loginController(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();

        String name=request.getParameter("name");
        String passWord=request.getParameter("passWord");
        User user=userService.selectUserByName(name);

        if(user.getPassWord().equals(EncodeByMd5.encodeByMD5(passWord))){
            modelAndView.setViewName("index");
        }
        else{
            modelAndView.setViewName("error");
        }
        return modelAndView;

    }
    

}
