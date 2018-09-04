package com.beike.hcc.blog.controller;

import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.UserService;
import com.beike.hcc.blog.util.EncodeByMd5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;


@Controller
public class RegisterController {
    @Autowired
    public UserService userService;


    @RequestMapping("/register")
    public String register(){
        return "register";
    }


    @RequestMapping("/request")
    public ModelAndView Register(HttpServletRequest request , User user , BindingResult bindingResult) {

        ModelAndView modelAndView = new ModelAndView();
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        String passWord = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm");
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("/register");
        }
        else{
            user.setUserName(name);
            user.setUserEmail(mail);
            //注册检测密码是否相符合

            if (passWord.equals(confirmPassword)) {

                String code = EncodeByMd5.encodeByMD5(passWord);
                user.setPassWord(code);
                userService.insertUser(user);
                modelAndView.setViewName("/userLogin");
                return modelAndView;
            } else {
                modelAndView.setViewName("/error");

            }

        }

        return modelAndView;

    }



}
