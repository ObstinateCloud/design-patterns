package com.lengedyun.avatar.version1;

/**
 * @author zjy
 * @title: AvatarClient_v1
 * @projectName design-patterns
 * @description: 装饰系统
 * @date 2019/7/7 10:39
 */
public class AvatarClient_v1 {

    public static void main(String[] args) {
        System.out.println("---------------装饰系统v1启动----------");
        Person_v1 xc = new Person_v1("小菜");
        System.out.println("第一种装扮：");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println("第二种装扮：");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();

    }
}
