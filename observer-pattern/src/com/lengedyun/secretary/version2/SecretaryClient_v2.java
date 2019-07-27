package com.lengedyun.secretary.version2;

import com.lengedyun.secretary.version1.Colleague_v1;
import com.lengedyun.secretary.version1.Secretary_v1;

/**
 * @title: SecretaryClient_v2
 * @description: 对观察者解耦
 * @auther: zjyun
 * @date: 2019/7/25 7:17
 */
public class SecretaryClient_v2 {

    public static void main(String[] args) {
        System.out.println("--------------前台秘书放哨，老板回来报告---------");
        Secretary_v2 mishu = new Secretary_v2();
        NBAObserver_v2 nbaObserverV2  =new NBAObserver_v2("zjy1",mishu);
        StockObserver_v2 stockObserverV2 = new StockObserver_v2("zjy2",mishu);
        mishu.attach(nbaObserverV2);
        mishu.attach(stockObserverV2);
        mishu.setAction("老板回来了");
        mishu.notifyAllColleague();
    }
}
