package com.example.springMVC.controller;

import com.example.springMVC.model.User4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:Siyu
 * @Date:Created in 上午9:29 2018/7/13
 */
@Controller
public class User4Controller {
    @GetMapping(value="/selectForm")
    public String selectForm2(Model model) {
        User4 user4 = new User4();
        List<String> list = new ArrayList<String>();
        list.add("2");
        user4.setDeptId(list);
        // 页面展现的可供选择的select下拉框内容deptMap
        Map<String, String> deptMap = new HashMap<String, String>();
        deptMap.put("1", "财务部");
        deptMap.put("2", "开发部");
        deptMap.put("3", "销售部");
        model.addAttribute("user4", user4);
        model.addAttribute("deptMap", deptMap);
        return "selectForm";
    }
}
