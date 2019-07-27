package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.NBAObserver_v2;
import com.lengedyun.secretary.version2.Secretary_v2;
import com.lengedyun.secretary.version2.StockObserver_v2;

/**
 * @title: SecretaryClient_v2
 * @description: 对观察者解耦 对通知者解耦
 * @auther: zjyun
 * @date: 2019/7/25 7:17
 */
public class SecretaryClient_v3 {

    public static void main(String[] args) {
        System.out.println("--------------前台秘书放哨，老板回来报告---------");
        Boss boss = new Boss();
        NBAObserver_v3 nbaObserverV3 = new NBAObserver_v3("zjy1",boss);
        StockObserver_v3 stockObserverV3 = new StockObserver_v3("zjy2",boss);
        boss.attach(nbaObserverV3);
        boss.attach(stockObserverV3);
        //故意不通知 看nba的
        boss.detach(nbaObserverV3);
        boss.setAction("老板我回来了");
        boss.notifyAllColleague();


        Secretary_v3 qiantai = new Secretary_v3();
        NBAObserver_v3 nbaObserverV3_1 = new NBAObserver_v3("zjy3",qiantai);
        StockObserver_v3 stockObserverV3_2 = new StockObserver_v3("zjy4",qiantai);
        qiantai.attach(nbaObserverV3_1);
        qiantai.attach(stockObserverV3_2);
        qiantai.setAction("老板回来了");
        qiantai.notifyAllColleague();
    }
}
