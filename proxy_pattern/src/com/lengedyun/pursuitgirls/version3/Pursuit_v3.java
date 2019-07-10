package com.lengedyun.pursuitgirls.version3;

import com.lengedyun.pursuitgirls.version1.Girl_v1;

/**
 * @author zjy
 * @title: Pursuit_v1
 * @projectName design-patterns
 * @description: 追求者类
 * @date 2019/7/7 14:37
 */
public class Pursuit_v3 implements GiveGift{

    Girl_v1 mm;

    public Pursuit_v3(Girl_v1 mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃!");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你鲜花!");
    }


    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力!");
    }
}
