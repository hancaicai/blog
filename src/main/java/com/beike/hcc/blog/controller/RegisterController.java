package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register");
    public void Register(HttpServletRequest request){
       String name= request.getParameter("name");
       String




    }



}
