package com.example.springMVC.controller;

import com.example.springMVC.model.User;
import com.example.springMVC.model.User4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

///**
// * @Author:Siyu
// * @Date:Created in 下午9:24 2018/7/12
// */
//@Controller
//public class user3Controller {
//    @GetMapping(value="/radiobuttonForm1")
//    public String registerForm(Model model) {
//        User4 user4 = new User4();
//        // 设置sex变量的值为男，页面的radio单选框的value=男会被选中
//        user4.setSex("男");
//        model.addAttribute("user4", user4);
//        return "radiobuttonForm1";
//    }
//
//    @GetMapping(value="/radiobuttonsForm2")
//    public String registerForm2(Model model) {
//        User4 user4 = new User4();
//        // 设置sex变量的值为男，页面的radio单选框的value=男会被选中
//        user4.setSex("男");
//        // 页面展现的可供选择的单选框内容sexList
//        List<String> sexList = new ArrayList<String>();
//        sexList.add("男");
//        sexList.add("女");
//        model.addAttribute("user4", user4);
//        model.addAttribute("sexList", sexList);
//        return "radiobuttonsForm2";
//    }
//
//    @GetMapping(value="/radiobuttonsForm")
//    public String registerForm3(Model model) {
//        User4 user4 = new User4();
//        // 设置sex变量的值为"1"，页面的radio单选框的value=男会被选中
//        user4.setSex("1");
//        // 页面展现的可供选择的单选框内容sexMap
//        Map<String, String> sexMap = new HashMap<String, String>();
//        sexMap.put("1", "男");
//        sexMap.put("2", "女");
//        model.addAttribute("user4", user4);
//        model.addAttribute("sexMap", sexMap);
//        return "radiobuttonsForm";
//    }
//
//
//}



