package com.wsy.system.entity;

import java.util.List;
import java.util.Map;

/**
 * @author within
 * @date 2023-02-07 17:17
 */
public class Dept {

    private String dName;

    private List<Emp> empList;

    private Map<String, Emp> empMap;
    private Map<String, Lesson> lessonMap;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public Map<String, Emp> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map<String, Emp> empMap) {
        this.empMap = empMap;
    }

    public Map<String, Lesson> getLessonMap() {
        return lessonMap;
    }

    public void setLessonMap(Map<String, Lesson> lessonMap) {
        this.lessonMap = lessonMap;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                ", empList=" + empList +
                ", empMap=" + empMap +
                ", lessonMap=" + lessonMap +
                '}';
    }

    public void info() {
        System.out.println("部门名称:" + dName + "员工：" + empList);
        for (Emp emp : empList
        ) {
            System.out.println(emp.geteName());
        }
    }

    public void info2() {
        System.out.println("部门名称:" + dName + "员工：" + empMap);
        empMap.forEach((s, emp) -> System.out.println(emp.geteName()));

    }

    public void info3() {
        System.out.println("部门名称:" + dName + "员工：" + lessonMap);
        for (Emp emp : empList
        ) {
            System.out.println(emp.geteName()+"年龄："+emp.getAge());
        }
        lessonMap.forEach((s, lesson) -> System.out.println(lesson.getLessonName()));

    }


}
