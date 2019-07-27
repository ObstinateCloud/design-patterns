package com.lengedyun.secretary.version2;

import com.lengedyun.secretary.version1.Secretary_v1;

/**
 * @title: Observer_v2
 * @description: 观察者
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public abstract class Observer_v2 {

    protected String name ;

    protected Secretary_v2 secretaryV2;

    public Observer_v2(String name, Secretary_v2 secretaryV2) {
        this.name = name;
        this.secretaryV2 = secretaryV2;
    }

    public abstract void updateAction();
}
