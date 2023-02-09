package com.wsy.system.entity;

import java.util.Arrays;

/**
 * @author within
 * @date 2023-02-07 17:17
 */
public class Emp {
    private Dept dept;
    private String eName;
    private Integer age;

    private String[] loves;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work() {
        System.out.println(eName+"正在work...,年龄："+age+"爱好:"+ Arrays.toString(loves));
        dept.info();
    }


}
