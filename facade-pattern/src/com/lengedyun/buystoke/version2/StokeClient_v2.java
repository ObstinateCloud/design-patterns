package com.lengedyun.buystoke.version2;

import com.lengedyun.buystoke.version1.NationalDebt1_v1;
import com.lengedyun.buystoke.version1.Realty1_v1;
import com.lengedyun.buystoke.version1.Stoke1_v1;
import com.lengedyun.buystoke.version1.Stoke2_v1;

/**
 * @title: StokeClient_v1
 * @description: 用基金统一管理各种投资  外观模式 或者门面模式
 * @auther: zjyun
 * @date: 2019/7/19 7:23
 */
public class StokeClient_v2 {

    public static void main(String[] args) {
        System.out.println("----------------股票交易------------");
        Fund_v2 fundV2 = new Fund_v2();
        fundV2.buyFund();
        System.out.println("-------------赚钱后------------------");
        fundV2.sellFund();
    }
}
