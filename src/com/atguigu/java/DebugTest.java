package com.atguigu.java;

import java.util.HashMap;

/**
 * User:Ren
 * Email:1465359522@qq.com
 * Date:2019/6/22
 * Time:16:44
 **/
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

        }
        HashMap<String, String> map;
        map = new HashMap<>();

        map.put("Name:", "Tom");
        map.put("Age:", "13");
        map.put("Sex:", "male");
        map.put("School:", "HUST");

        String name = map.get("Name:");
        System.out.println(name);
        System.out.println(map);


    }
}
