package com.lengedyun.secretary.version1;

/**
 * @title: Colleague_v1
 * @description: 同事1
 * @auther: zjyun
 * @date: 2019/7/25 7:24
 */
public class Colleague_v1 {

    private String name;

    private Secretary_v1 secretary_v1;

    public Colleague_v1(String name, Secretary_v1 secretary_v1) {
        this.name = name;
        this.secretary_v1 = secretary_v1;
    }

    public void updateAction(){
        System.out.println(secretary_v1.getAction()+","+name+"停止游戏，开始工作");
    }
}
