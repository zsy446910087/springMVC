package com.example.springMVC.model;

import java.io.Serializable;
import java.util.List;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
public class Dept implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;


	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dept(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



}
