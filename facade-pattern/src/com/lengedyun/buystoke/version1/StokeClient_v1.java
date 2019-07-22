package com.lengedyun.buystoke.version1;

/**
 * @title: StokeClient_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/19 7:23
 */
public class StokeClient_v1 {

    public static void main(String[] args) {
        System.out.println("----------------股票交易------------");
        Stoke1_v1 stoke1V1 = new Stoke1_v1();
        stoke1V1.buy();
        Stoke2_v1 stoke2V1 = new Stoke2_v1();
        stoke2V1.buy();
        NationalDebt1_v1 nationalDebt1V1 = new NationalDebt1_v1();
        nationalDebt1V1.buy();
        Realty1_v1 realty1V1 = new Realty1_v1();
        realty1V1.buy();
        System.out.println("-------------赚钱后------------------");
        stoke1V1.sell();
        stoke2V1.sell();
        nationalDebt1V1.sell();
        realty1V1.sell();
    }
}
