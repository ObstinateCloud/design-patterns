package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.Secretary_v2;

/**
 * @title: Observer_v2
 * @description: 观察者
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public abstract class Observer_v3 {

    protected String name ;

    protected Subject_v3 secretaryV3;

    public Observer_v3(String name, Subject_v3 secretaryV3) {
        this.name = name;
        this.secretaryV3 = secretaryV3;
    }

    public abstract void updateAction();
}
