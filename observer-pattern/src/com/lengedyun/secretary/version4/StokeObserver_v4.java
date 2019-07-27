package com.lengedyun.secretary.version4;

import com.lengedyun.secretary.version3.Subject_v3;

import java.util.Date;

/**
 * @title: StokeObserver_v4
 * @description: 股市行情观察者 事件委托
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public class StokeObserver_v4 {

    private String name;


    public StokeObserver_v4(String name) {
        this.name = name;
        System.out.println(name+"正在看股票行情"+new Date());
    }

    public void colseStokeMarket(Date date){
        System.out.println(date+":收到通知："+name+",关闭股票行情，开始工作");
    }
}
