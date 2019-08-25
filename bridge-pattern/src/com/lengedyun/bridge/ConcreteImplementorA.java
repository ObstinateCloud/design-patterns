package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: ConcreteImplementorA
 * @projectName design-patterns
 * @description: 具体的实现A
 * @date 2019/8/25 14:55
 */
public class ConcreteImplementorA extends Implementor1 {

    @Override
    public void operation() {
        System.out.println("A对抽象维度1的实现");
    }
}
