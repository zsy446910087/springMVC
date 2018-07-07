package com.example.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Author:Siyu
 * @Date:Created in 下午7:27 2018/7/4
 */

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class FormController{

	// 该方法映射的请求为http://localhost:8080/ModelAttributeTest/{formName}
	@RequestMapping(value="/{formName}", method = { org.springframework.web.bind.annotation.RequestMethod.PUT })
	 public String loginForm(@PathVariable String formName){
		// 动态跳转页面
		return formName;
	}

}

