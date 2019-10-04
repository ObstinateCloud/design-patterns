package com.lengedyun.barbecuer.version1;

/**
 * @author zjy
 * @title: BarbecuerClient_V1
 * @projectName design-patterns
 * @description: 烧烤摊经营模式 烧烤师父接受烤串需求
 * @date 2019/9/22 17:23
 */
public class BarbecuerClient_V1 {

    public static void main(String[] args) {
        System.out.println("------烧烤摊系统启动----");
        Barbecuer_V1 b1=  new Barbecuer_V1("b1");
        b1.bakeChickenWing(1);
        b1.bakeMutton(3);
        Barbecuer_V1 b2=  new Barbecuer_V1("b2");
        b2.bakeChickenWing(13);
        b2.bakeMutton(23);
        Barbecuer_V1 b3=  new Barbecuer_V1("b3");
        b3.bakeChickenWing(11);
        b3.bakeMutton(30);

    }
}
