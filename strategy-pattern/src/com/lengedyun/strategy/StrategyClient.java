package com.lengedyun.strategy;

/**
 * @author zjy
 * @title: StrategyClient
 * @projectName design-patterns
 * @description: 策略客户端
 * @date 2019/6/30 17:15
 */
public class StrategyClient {

    public static void main(String[] args) {

        Context context;
        context = new Context(new ConcreteStrategyA());
        context.CotextInterface();

        context = new Context(new ConcreteStrategyB());
        context.CotextInterface();

        context = new Context(new ConcreteStrategyC());
        context.CotextInterface();
    }
}
