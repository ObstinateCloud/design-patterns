package com.lengedyun.secretary.version2;

import com.lengedyun.secretary.version1.Secretary_v1;

/**
 * @title: Observer_v2
 * @description: 股票观察者
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public class StockObserver_v2 extends Observer_v2{


    public StockObserver_v2(String name, Secretary_v2 secretaryV2) {
        super(name,secretaryV2);
    }

    @Override
    public  void updateAction(){
        System.out.println(secretaryV2.getAction()+","+name+"停止看股票，开始工作");
    }
}
