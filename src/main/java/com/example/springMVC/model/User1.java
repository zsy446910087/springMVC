package com.example.springMVC.model;

import java.io.Serializable;

/**
 * @Author:Siyu
 * @Date:Created in 下午8:03 2018/7/9
 */
public class User1 implements Serializable {

    private static final long serialVersionUID = 1L;

    // 私有字段
    private String username;
    private String sex;
    private Integer age;

    public User1() {
        super();
    }

    public User1(String username, String sex, Integer age) {
        super();
        this.username = username;
        this.sex = sex;
        this.age = age;
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


    @Override
    public String toString() {
        return "User [username=" + username + ", sex=" + sex + ", age=" + age
                + "]";
    }




}
