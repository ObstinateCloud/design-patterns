package com.lengedyun.templatemethod;

/**
 * @title: ConcreteClassA
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/18 6:44
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    public void operation1() {
        System.out.println("ClassA operator1");
    }

    @Override
    public void operation2() {
        System.out.println("ClassA operator2");
    }
}
