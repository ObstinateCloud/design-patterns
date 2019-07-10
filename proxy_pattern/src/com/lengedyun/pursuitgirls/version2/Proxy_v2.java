package com.lengedyun.pursuitgirls.version2;

import com.lengedyun.pursuitgirls.version1.Girl_v1;

/**
 * @title: Proxy_v2
 * @description: TODO
 * @auther: Administrator
 * @date: 2019/7/9 23:00
 */
public class Proxy_v2 {

    Girl_v1 mm;

    public Proxy_v2(Girl_v1 mm) {
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName()+"送你洋娃娃!");
    }

    public void giveFlowers(){
        System.out.println(mm.getName()+"送你鲜花!");
    }

    public void giveChocolate(){
        System.out.println(mm.getName()+"送你巧克力!");
    }
}
