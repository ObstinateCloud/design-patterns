package com.lengedyun.secretary.version4;

import com.lengedyun.secretary.version3.Boss;
import com.lengedyun.secretary.version3.NBAObserver_v3;
import com.lengedyun.secretary.version3.Secretary_v3;
import com.lengedyun.secretary.version3.StockObserver_v3;

import java.util.Date;

/**
 * @title: SecretaryClient_v4
 * @description: 事件委托机制 实现
 * @auther: zjyun
 * @date: 2019/7/25 7:17
 */
public class SecretaryClient_v4 {

    public static void main(String[] args) {
       System.out.println("--------------前台秘书放哨，老板回来报告---------");
       Notifier goodNotifier = new GoodNotifier();
       NBAObserver_v4 nbaObserverV4 = new NBAObserver_v4("zjy1");
       StokeObserver_v4 stokeObserverV4 = new StokeObserver_v4("zjy2");

       goodNotifier.addListener(nbaObserverV4,"colseNBADirectSeeding",new Date());
       goodNotifier.addListener(stokeObserverV4,"colseStokeMarket",new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goodNotifier.notifyX();
    }
}
