package com.lengedyun.avatar.version2;

import com.lengedyun.avatar.version1.Person_v1;

/**
 * @author zjy
 * @title: AvatarClient_v1
 * @projectName design-patterns
 * @description: 装饰系统 人与服饰分离
 * @date 2019/7/7 10:39
 */
public class AvatarClient_v2 {

    public static void main(String[] args) {
        System.out.println("---------------装饰系统v2启动----------");
        Person_v2 xc = new Person_v2("小菜");
        System.out.println("第一种装扮：");
        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();
        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        xc.show();
        System.out.println("第二种装扮：");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();
        suit.show();
        tie.show();
        leatherShoes.show();
        xc.show();

    }
}
