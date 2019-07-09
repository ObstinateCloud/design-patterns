package com.lengedyun.decorator;

/**
 * @author zjy
 * @title: ConcreteDecoratorA
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/7 11:21
 */
public class ConcreteDecoratorB extends Decorator{


    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){
        System.out.println("B独有的方法");
    }

}
