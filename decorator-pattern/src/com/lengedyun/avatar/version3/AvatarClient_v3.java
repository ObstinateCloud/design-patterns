package com.lengedyun.avatar.version3;

import com.lengedyun.avatar.version1.Person_v1;
import com.lengedyun.avatar.version2.*;

/**
 * @author zjy
 * @title: AvatarClient_v1
 * @projectName design-patterns
 * @description: 装饰系统 装饰着模式改造
 * @date 2019/7/7 10:39
 */
public class AvatarClient_v3 {

    public static void main(String[] args) {
        System.out.println("---------------装饰系统v3启动----------");
        Person_v2 xc = new Person_v2("小菜");
        System.out.println("第一种装扮：");
        Sneakers_v3 sneakersV3 = new Sneakers_v3();
        BigTrouser_v3 bigTrouserV3 = new BigTrouser_v3();
        TShirts_v3 tShirtsV3 = new TShirts_v3();
        sneakersV3.decorate(xc);
        bigTrouserV3.decorate(sneakersV3);
        tShirtsV3.decorate(bigTrouserV3);
        tShirtsV3.show();
        System.out.println("第二种装扮：");
        LeatherShoes_v3 leatherShoesV3 = new LeatherShoes_v3();
        Tie_v3 tieV3 = new Tie_v3();
        Suit_v3 suitV3 = new Suit_v3();
        leatherShoesV3.decorate(xc);
        tieV3.decorate(leatherShoesV3);
        suitV3.decorate(tieV3);
        suitV3.show();

    }
}
