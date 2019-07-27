package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.Observer_v2;
import com.lengedyun.secretary.version2.Secretary_v2;

/**
 * @title: Observer_v2
 * @description: 股票观察者
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public class StockObserver_v3 extends Observer_v3{

    private Subject_v3 subjectV3;

    public StockObserver_v3(String name, Subject_v3 subjectV3) {
        super(name,subjectV3);
        this.subjectV3 = subjectV3;
    }

    @Override
    public  void updateAction(){
        System.out.println(subjectV3.getSubjectState()+","+name+"停止看股票，开始工作");
    }
}
