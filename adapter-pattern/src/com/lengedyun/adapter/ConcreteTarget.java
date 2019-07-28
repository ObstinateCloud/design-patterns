package com.lengedyun.adapter;

/**
 * @author zjy
 * @title: ConcreteTarget
 * @projectName design-patterns
 * @description: 目标类的实现
 * @date 2019/7/28 17:16
 */
public class ConcreteTarget extends Target{
    @Override
    public void normalRequest() {
        System.out.println("this is  a normal request");
    }
}
