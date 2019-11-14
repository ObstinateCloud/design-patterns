package com.lengedyun.flyweight;

/**
 * @author zjy
 * @title: FlyWeightClient
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:12
 */
public class FlyWeightClient {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight flyWeight1 = factory.getFlyWeight("x");
        flyWeight1.operation(--extrinsicstate);

        FlyWeight flyWeight2 = factory.getFlyWeight("y");
        flyWeight2.operation(--extrinsicstate);

        FlyWeight flyWeight3 = factory.getFlyWeight("z");
        flyWeight3.operation(--extrinsicstate);

        UnShareConcreteFlyWeight unShareConcreteFlyWeight = new UnShareConcreteFlyWeight();
        unShareConcreteFlyWeight.operation(--extrinsicstate);
    }
}
