package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: ConcreteImplementorB
 * @projectName design-patterns
 * @description: 具体的实现B
 * @date 2019/8/25 14:55
 */
public class ConcreteImplementorB extends Implementor1 {

    @Override
    public void operation() {
        System.out.println("B对抽象维度1的实现");
    }
}
