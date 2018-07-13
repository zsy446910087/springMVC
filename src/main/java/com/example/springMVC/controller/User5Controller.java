package com.example.springMVC.controller;

import com.example.springMVC.model.User1;
import com.example.springMVC.service.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author:Siyu
 * @Date:Created in 下午1:48 2018/7/13
 */
@Controller
public class User5Controller{

    @GetMapping(value="/registerForm1")
    public String registerForm(Model model) {
        User1 user = new User1();
        // model中添加属性user，值是user对象
        model.addAttribute("user1",user);
        return "registerForm1";
    }

    @InitBinder
    public void initBinder(DataBinder binder) {
        // 设置验证的类为UserValidator
        binder.setValidator(new UserValidator());
    }

    @PostMapping(value="/register")
    public String register(@Validated User1 user1, Errors errors) {
        // 如果Errors对象有Field错误的时候，重新跳回注册页面，否则正常提交
        if (errors.hasFieldErrors())
            return "registerForm1";
        return "submit";
    }


}

