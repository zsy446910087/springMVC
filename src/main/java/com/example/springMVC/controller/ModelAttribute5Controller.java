package com.example.springMVC.controller;

import com.example.springMVC.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Author:Siyu
 * @Date:Created in 下午2:27 2018/7/7
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class ModelAttribute5Controller{

    	/*
    	 *  @ModelAttribute注释方法参数，会自动入参
    	 *  loginname控件的值会自动入参到User的loginname属性
    	 *  password控件的值会自动入参到User的password属性
    	 */
    	@RequestMapping(value="/login5")
		 public String login5(@ModelAttribute User user) {
			user.setUsername("管理员");
			 return "result5";
		 }
}

