package com.lengedyun.strategy;

/**
 * @author zjy
 * @title: ConcreteStrategyA
 * @projectName design-patterns
 * @description: 具体策略A
 * @date 2019/6/30 17:09
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void AlgoreithmInterface() {
        System.out.println("算法a实现");
    }
}
