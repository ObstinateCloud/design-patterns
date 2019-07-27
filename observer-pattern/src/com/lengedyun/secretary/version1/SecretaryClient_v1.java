package com.lengedyun.secretary.version1;

/**
 * @title: SecretaryClient_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/25 7:17
 */
public class SecretaryClient_v1 {

    public static void main(String[] args) {
        System.out.println("--------------前台秘书放哨，老板回来报告---------");
        Secretary_v1 mishu1 = new Secretary_v1();
        Colleague_v1 zjy1 = new Colleague_v1("zjy1",mishu1);
        Colleague_v1 zjy2 = new Colleague_v1("zjy2",mishu1);
        mishu1.attach(zjy1);
        mishu1.attach(zjy2);
        mishu1.setAction("老板回来了");
        mishu1.notifyAllColleague();
    }
}
