package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: BridgeClient
 * @projectName design-patterns
 * @description: 桥接模式 如果系统可能从多维度扩展,那么尽可能把每个维度抽象出来让它的变化不影响其他的
 * 模块的变化
 * @date 2019/8/25 15:06
 */
public class BridgeClient {

    public static void main(String[] args) {
        System.out.println("----------桥接模式客户端---------");
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor1(new ConcreteImplementorA());
        abstraction.setImplementor2(new ConcreteImplementorC());
        abstraction.operate();
    }
}
