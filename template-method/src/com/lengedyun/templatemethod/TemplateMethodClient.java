package com.lengedyun.templatemethod;

/**
 * @title: TemplateMethodClient
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/18 6:48
 */
public class TemplateMethodClient {

    public static void main(String[] args) {
        System.out.println("----------TemplateMethodClient----------");
        AbstractClass abstractClassA = new ConcreteClassA();
        abstractClassA.templateMethod();
        AbstractClass abstractClassB = new ConcreteClassB();
        abstractClassB.templateMethod();
    }
}
