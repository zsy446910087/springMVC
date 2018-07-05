package com.example.springMVC.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:Siyu
 * @Date:Created in 下午7:27 2018/7/4
 */
@Controller
//同时测试@PathVariable、@RequestHeader和@CookieValue注解使用
public class DataBindingController {
    //静态日志类LogFactory
    private static final Log logger= LogFactory.getLog(DataBindingController
    .class);
    //测试@PathVariable注解
    //该方法映射请求为：http://localhost:8080/pathVariableTest/{userId}
    @RequestMapping(value="/pathVariableTest/{userId}")
    @ResponseBody
    public void pathVariableTest(@PathVariable Integer userId){
        logger.info("通过@PathVariable获得数据"+ userId);
    }
    // 测试@RequestHeader注解
    // 该方法映射的请求为 /requestHeaderTest
    @RequestMapping(value="/requestHeaderTest")
    @ResponseBody
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value="Accept") String[] accepts) {
        logger.info("通过@requestHeaderTest获得数据： " + userAgent);
        logger.info("通过@requestHeaderTest获得Accept： ");
        // 循环输出头信息
        for(String accept : accepts){
            logger.info(accept);
        }
    }
    //测试@CookieValue注解
    @RequestMapping(value ="/cookieValueTest")
    @ResponseBody
    public void cookieValueTest(@CookieValue(value = "JSESSIONID",defaultValue = "")
                                String sessionID){
        logger.info("通过@CookieValue获得数据"+sessionID);

    }
}
