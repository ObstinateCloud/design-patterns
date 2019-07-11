package com.lengedyun.leifeng.version1;

/**
 * @title: LeiFeng_v1
 * @description: 雷锋父类
 * @auther: zjyun
 * @date: 2019/7/12 6:43
 */
public class LeiFeng_v1 {

    private String name;

    public LeiFeng_v1(String name) {
        this.name = name;
    }

    public void sweep(){
        System.out.println(name+"扫地");
    }

    public void wash(){
        System.out.println(name+"洗衣服");
    }

    public void buyRice(){
        System.out.println(name+"买米");
    }

}
