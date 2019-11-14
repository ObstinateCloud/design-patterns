package com.lengedyun.flyweight;

/**
 * @author zjy
 * @title: ConcreteFlyWeight
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:04
 */
public class ConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体的FlyWeight:"+extrinsicstate);
    }
}
