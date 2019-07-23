package com.lengedyun.builder;

/**
 * @title: Director
 * @description: 指挥者
 * @auther: zjyun
 * @date: 2019/7/24 7:04
 */
public class Director {

    Builder builder;

    public Director() {
    }


    public void createProduct(Builder builder){
       builder.buildPartA();
       builder.buildPartB();
    }

}
