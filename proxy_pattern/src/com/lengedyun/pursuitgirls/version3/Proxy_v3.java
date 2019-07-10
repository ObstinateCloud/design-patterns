package com.lengedyun.pursuitgirls.version3;

import com.lengedyun.pursuitgirls.version1.Girl_v1;

/**
 * @title: Proxy_v2
 * @description: TODO
 * @auther: Administrator
 * @date: 2019/7/9 23:00
 */
public class Proxy_v3 implements GiveGift {

    //真正送礼物的人
    Pursuit_v3 realGiveGift;

    public Proxy_v3(Girl_v1 mm) {
        realGiveGift = new Pursuit_v3(mm);
    }

    @Override
    public void giveDolls() {
        realGiveGift.giveDolls();
    }

    @Override
    public void giveFlowers() {
        realGiveGift.giveFlowers();
    }


    @Override
    public void giveChocolate() {
        realGiveGift.giveChocolate();
    }
}
