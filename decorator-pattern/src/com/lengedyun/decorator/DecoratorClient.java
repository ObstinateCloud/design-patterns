package com.lengedyun.decorator;

/**
 * @author zjy
 * @title: DecoratorClient
 * @projectName design-patterns
 * @description: 装饰客户端
 * @date 2019/7/7 11:15
 */
public class DecoratorClient {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
        b.operation();
    }
}
