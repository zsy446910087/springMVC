package com.example.springMVC.model;

import java.io.Serializable;

/**
 * @Author:Siyu
 * @Date:Created in 下午9:32 2018/7/12
 */

    public class User4 implements Serializable {

        private static final long serialVersionUID = 1L;

        private String sex;

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

    }

