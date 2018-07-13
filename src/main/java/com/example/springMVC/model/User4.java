package com.example.springMVC.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:Siyu
 * @Date:Created in 下午9:32 2018/7/12
 */

    public class User4 implements Serializable {

       // private static final long serialVersionUID = 1L;

        //private String sex;
        private List<String> deptId;
        public User4(){
            super();
        }

        public List<String> getDeptId() {
            return deptId;
        }

//        public void setDeptId(Integer deptId) {
//            this.deptId = deptId;
//        }
    public void setDeptId(List<String> deptId) {
        this.deptId = deptId;
    }


}

