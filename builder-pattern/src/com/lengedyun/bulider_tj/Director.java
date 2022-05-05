package com.lengedyun.bulider_tj;

/**
 * @title: Director
 * @description: 指挥者
 * @auther: zhangjianyun
 * @date: 2022/5/5 18:24
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Hello-World");
        builder.makeString(" This is first Program ");
        builder.makeItem(new String[]{"java","c++"});

        builder.makeString(" 这是第一个程序 ");
        builder.makeItem(new String[]{"java语言","c++语言"});
        builder.close();
    }
}
