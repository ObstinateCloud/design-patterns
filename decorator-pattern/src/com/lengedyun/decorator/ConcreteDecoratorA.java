package com.lengedyun.decorator;

/**
 * @author zjy
 * @title: ConcreteDecoratorA
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/7 11:21
 */
public class ConcreteDecoratorA extends Decorator{

    //A独有的方法
    private String addedStateA;

    public void operation(){
        super.operation();
        addedStateA = "New State";
        System.out.println("具体装饰对象A的操作");
    }

}
