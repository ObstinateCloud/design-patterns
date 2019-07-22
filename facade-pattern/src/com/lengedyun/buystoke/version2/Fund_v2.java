package com.lengedyun.buystoke.version2;

import com.lengedyun.buystoke.version1.NationalDebt1_v1;
import com.lengedyun.buystoke.version1.Realty1_v1;
import com.lengedyun.buystoke.version1.Stoke1_v1;
import com.lengedyun.buystoke.version1.Stoke2_v1;

/**
 * @title: Fund_v2
 * @description: 基金类  采用组合
 * @auther: zjyun
 * @date: 2019/7/22 21:41
 */
public class Fund_v2 {

    private Stoke1_v1 stoke1V1;

    private Stoke2_v1 stoke2V1;

    private NationalDebt1_v1 nationalDebt1V1;

    private Realty1_v1 realty1V1;

    public Fund_v2() {
        this.stoke1V1 = new Stoke1_v1();
        this.stoke2V1 = new Stoke2_v1();
        this.nationalDebt1V1 = new NationalDebt1_v1();
        this.realty1V1 = new Realty1_v1();
    }

    public void sellFund(){
        stoke1V1.sell();
        stoke2V1.sell();
        nationalDebt1V1.sell();
        realty1V1.sell();
    }

    public void buyFund(){
        stoke1V1.buy();
        stoke2V1.buy();
        nationalDebt1V1.buy();
        realty1V1.buy();
    }
}
