package com.example.springMVC.controller;

import com.example.springMVC.model.User;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @Author:Siyu
 * @Date:Created in 上午8:43 2018/7/5
 */
@Controller
@SessionAttributes("user")
public class SessionAttributesController {
    private static final Log logger= LogFactory.getLog(SessionAttributesController
            .class);
    // 该方法映射的请求为http://localhost:8080/{formName}
    @RequestMapping(value ="/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }
    // 该方法映射的请求为http://localhost:8080/login
    @RequestMapping(value="/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model ) {
        // 创建User对象，装载用户信息
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        // 将user对象添加到Model当中
        model.addAttribute("user",user);
        return "welcome";
    }

}
