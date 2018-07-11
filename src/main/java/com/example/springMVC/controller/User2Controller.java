package com.example.springMVC.controller;

/**
 * @Author:Siyu
 * @Date:Created in 下午7:38 2018/7/11
 */

import com.example.springMVC.model.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *  HelloWorldController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class User2Controller{

    @GetMapping(value="/checkboxForm")
    public String registerForm(Model model) {
        User2 user2 = new User2();
        // 设置boolean变量reader的值为true，页面的checkbox复选框会被选中
        user2.setReader(true);
        // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
        List<String> list = new ArrayList<String>();
        list.add("JAVAEE");
        list.add("Spring");
        user2.setCourses(list);
        // model中添加属性command，值是user对象
        model.addAttribute("user2",user2);
        return "checkboxForm";
    }


}

