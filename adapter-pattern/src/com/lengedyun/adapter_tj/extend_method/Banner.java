package com.lengedyun.adapter_tj.extend_method;

/**
 * @title: Banner
 * @description: 当前实际情况 交流100v
 * @auther: zhangjianyun
 * @date: 2022/4/24 18:13
 */
public class Banner {

    private int volt;

    public Banner(int volt) {
        this.volt = volt;
    }

    public void upVolt(){
        System.out.println("++volt:"+(++volt));
    };

    public void downVolt(){
        System.out.println("--volt:"+(--volt));
    }
}
