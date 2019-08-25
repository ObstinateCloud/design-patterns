package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: ConcreteImplementorC
 * @projectName design-patterns
 * @description: 具体的实现C
 * @date 2019/8/25 14:55
 */
public class ConcreteImplementorC extends Implementor2 {

    @Override
    public void operation() {
        System.out.println("C对抽象维度2的实现");
    }
}
