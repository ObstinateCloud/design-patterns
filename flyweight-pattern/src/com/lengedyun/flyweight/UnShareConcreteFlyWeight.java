package com.lengedyun.flyweight;

/**
 * @author zjy
 * @title: UnShareConcreteFlyWeight
 * @projectName design-patterns
 * @description: 非共享FlyWeight子类
 * @date 2019/11/12 7:04
 */
public class UnShareConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("非共享具体的FlyWeight:"+extrinsicstate);
    }
}
