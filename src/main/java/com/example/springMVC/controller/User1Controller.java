package com.example.springMVC.controller;

/**
 * @Author:Siyu
 * @Date:Created in 下午8:05 2018/7/9
 */

import com.example.springMVC.model.User1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  HelloWorldController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class User1Controller{

    @GetMapping(value="/registerForm")
    public String registerForm(Model model) {
        User1 user = new User1("jack","男",28);
        // model中添加属性command，值是user对象
        model.addAttribute("command",user);
        return "registerForm";
    }

    @GetMapping(value="/registerForm2")
    public String registerForm2(Model model) {
        User1 user = new User1("jack","男",28);
        // model中添加属性user，值是user对象
        model.addAttribute("user",user);
        return "registerForm2";
    }

}

