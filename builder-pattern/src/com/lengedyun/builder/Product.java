package com.lengedyun.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: Product
 * @description: 产品类
 * @auther: zjyun
 * @date: 2019/7/24 6:53
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void addPart(String partName){
        parts.add(partName);
    }

    public void show(){
        System.out.println("------------创建产品--------");
        parts.forEach(p->{
            System.out.println(p);
        });
    }


}
