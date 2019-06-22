package com.atguigu.bean;

import java.util.ArrayList;

public class Customer {
    public String getName() {
        return name;
    }

    public Customer(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String name;
    private String age;

    public Customer() {
    }

    public static void main(String[] args) {
        System.out.println("123!!");

        ArrayList a = new ArrayList(); // shift+enter:快速到下一行
    }

    public void method() {
        Object obj = new Object();
        ArrayList a = new ArrayList();

        a.add(1);
        synchronized (obj) {
        }
        ;
    }
}
