package com.wsy.car.entity;

import lombok.Data;

/**
 * @author within
 * @date 2023-02-10 14:39
 */
@Data
public class Car {

    private String name;

    private int age;

    private String color;

    private void run(){
        System.out.println("--run--");
    }

    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Car() {
    }


}
