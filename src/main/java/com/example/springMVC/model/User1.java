package com.example.springMVC.model;

import java.io.Serializable;

/**
 * @Description:
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a>
 * @author 肖文吉	36750064@qq.com
 * @version V1.0
 */

// 域对象，实现序列化接口
public class User1 implements Serializable{

    private static final long serialVersionUID = 1L;

    private String username;
    private String sex;
    private Integer age;

    public User1() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
