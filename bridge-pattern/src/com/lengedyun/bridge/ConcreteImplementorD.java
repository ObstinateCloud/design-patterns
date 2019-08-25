package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: ConcreteImplementorD
 * @projectName design-patterns
 * @description: 具体的实现D
 * @date 2019/8/25 14:55
 */
public class ConcreteImplementorD extends Implementor2 {

    @Override
    public void operation() {
        System.out.println("D对抽象维度2的实现");
    }
}
