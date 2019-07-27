package com.lengedyun.secretary.version4;

import com.lengedyun.observer.Subject;
import com.lengedyun.secretary.version3.Observer_v3;
import com.lengedyun.secretary.version3.Subject_v3;

import java.util.Date;

/**
 * @title: NBAObserver_v4
 * @description: NBA观察者 事件委托
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public class NBAObserver_v4 {

    private String name;


    public NBAObserver_v4(String name) {
        this.name = name;
        System.out.println(name+"正在看NBA直播"+new Date());
    }

    public void colseNBADirectSeeding(Date date){
        System.out.println(date+":收到通知："+name+",关闭NBA直播，开始工作");
    }
}
