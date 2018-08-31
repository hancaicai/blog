package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.UserService;
import com.beike.hcc.blog.util.EncodeByMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;

public class RegisterController {
    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    public ModelAndView Register(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        String passWord = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm");

        user.setUserName(name);
        user.setUserEmail(mail);

        //注册检测密码是否相符合

        if (passWord == confirmPassword) {

            String code = EncodeByMd5.encodeByMD5(passWord);
            user.setPassWord(code);
            userService.inserUser(user);
            modelAndView.setViewName("/register");


        } else {
            modelAndView.setViewName("/error");

        }

        return modelAndView;

    }







}
