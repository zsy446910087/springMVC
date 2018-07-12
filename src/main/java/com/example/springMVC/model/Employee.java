package com.example.springMVC.model;

import java.io.Serializable;
import java.util.List;


public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Dept> depts;

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}

	
	
	
}
