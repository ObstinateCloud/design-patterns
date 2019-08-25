package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: RefinedAbstraction
 * @projectName design-patterns
 * @description: 被提炼的抽象
 * @date 2019/8/25 14:54
 */
public class RefinedAbstraction extends Abstraction{


    public void operate(){
        implementor1.operation();
        implementor2.operation();
    }
}
