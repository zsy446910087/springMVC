package com.example.springMVC.controller;

import com.example.springMVC.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @Author:Siyu
 * @Date:Created in 下午3:53 2018/7/4
 */

@Controller
public class ModelController{

    @RequestMapping(value="/modelTest")
    public String modelTest(Model model){
        System.out.println("modelTest");
        User user = new User();
        // 设置user对象的username属性
        user.setUsername("modelTest");
        // 将User对象添加到Model当中
        model.addAttribute("user", user);
        return "result1";
    }

    @RequestMapping(value="/ModelMapTest")
    public String ModelMapTest(ModelMap modelMap){
        System.out.println("ModelMapTest");
        User user = new User();
        // 设置user对象的username属性
        user.setUsername("ModelMapTest");
        // 将User对象添加到ModelMap当中
        modelMap.addAttribute("user", user);
        return "result2";
    }



}

