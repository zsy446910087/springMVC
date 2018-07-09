package com.example.springMVC.controller;

import javax.servlet.http.HttpServletResponse;
import com.example.springMVC.model.Book;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/json")
public class BookController {
	private static final Log logger= LogFactory.getLog(BookController.class);
	// @RequestBody根据json数据，转换成对应的Object
    @RequestMapping(value="/testRequestBody",method= RequestMethod.POST)
    public void setJson(@RequestBody Book book,
    		HttpServletResponse response) throws Exception{
    	// ObjectMapper类是Jackson库的主要类。它提供一些功能将Java对象转换成对应的JSON格式的数据
    	ObjectMapper mapper = new ObjectMapper();
    	// 将book对象转换成json输出
    	System.out.println(mapper.writeValueAsString(book) );
    	book.setAuthor("肖文吉");
    	response.setContentType("text/html;charset=UTF-8");
    	// 将book对象转换成json写出到客户端
    	response.getWriter().println(mapper.writeValueAsString(book));
    }

}
