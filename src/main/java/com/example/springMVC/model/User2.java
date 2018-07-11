package com.example.springMVC.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:Siyu
 * @Date:Created in 下午7:37 2018/7/11
 */
    // 域对象，实现序列化接口
    public class User2 implements Serializable {

        private static final long serialVersionUID = 1L;

        private boolean reader;
        private List<String> courses;

        public User2() {
            super();
        }


        public boolean isReader() {
            return reader;
        }


        public void setReader(boolean reader) {
            this.reader = reader;
        }


        public List<String> getCourses() {
            return courses;
        }


        public void setCourses(List<String> courses) {
            this.courses = courses;
        }




    }

