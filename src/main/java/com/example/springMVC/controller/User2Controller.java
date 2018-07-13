//package com.example.springMVC.controller;
//
///**
// * @Author:Siyu
// * @Date:Created in 下午7:38 2018/7/11
// */
//
//import com.example.springMVC.model.Dept;
//import com.example.springMVC.model.Employee;
//import com.example.springMVC.model.User2;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// *  HelloWorldController是一个基于注解的控制器,
// *  可以同时处理多个请求动作，并且无须实现任何接口。
// *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
// */
//@Controller
//public class User2Controller{
//
//    @GetMapping(value="/checkboxesForm1")
//    public String registerForm(Model model) {
//        User2 user2 = new User2();
//        // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
//        List<String> list = new ArrayList<String>();
//        list.add("JAVAEE");
//        list.add("Spring");
//        user2.setCourses(list);
//        // 页面展现的可供选择的复选框内容courseList
//        List<String> courseList = new ArrayList<String>();
//        courseList.add("JAVAEE");
//        courseList.add("Mybatis");
//        courseList.add("Spring");
//        // model中添加属性user和courseList
//        model.addAttribute("user2",user2);
//        model.addAttribute("courseList",courseList);
//        return "checkboxesForm";
//    }
//
//    @GetMapping(value="/checkboxForm")
//    public String registerForm2(Model model) {
//        User2 user2 = new User2();
//        // 为集合变量courses添加“JAVAEE”和“Spring”，页面的checkbox复选框这两项会被选中
//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("3");
//        user2.setCourses(list);
//        // 页面展现的可供选择的复选框内容courseList
//        Map<String, String> courseMap = new HashMap<String, String>();
//        courseMap.put("1","JAVAEE");
//        courseMap.put("2","Mybatis");
//        courseMap.put("3","Spring");
//        // model中添加属性user和courseList
//        model.addAttribute("user2",user2);
//        model.addAttribute("courseMap",courseMap);
//        return "checkboxForm";
//    }
//
//    @GetMapping(value="/checkboxesForm3")
////    public String registerForm3(Model model) {
////        Employee employee = new Employee();
////        Dept dept = new Dept(1,"开发部");
////        // 为集合变量depts添加Dept对象，该对象id=1，name=开发吧，页面的checkbox复选框这一项会被选中
////        List<Dept> list = new ArrayList<Dept>();
////        list.add(dept);
////        employee.setDepts(list);
////        // 页面展现的可供选择的复选框内容deptList
////        Map<Integer, String> deptMap = new HashMap<Integer, String>();
////      //  List<Dept> deptList = new ArrayList<Dept>();
////        deptMap.put(dept.getId(),dept.getName());
////        deptMap.put(2,"销售部");
////        deptMap.put(3,"财务部");
////        // model中添加属性employee和deptList
////        model.addAttribute("employee",employee);
////        model.addAttribute("deptMap",deptMap);
////        return "checkboxesForm3";
////    }
//
//}
//
