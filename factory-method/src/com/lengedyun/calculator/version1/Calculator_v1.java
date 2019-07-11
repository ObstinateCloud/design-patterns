package com.lengedyun.calculator.version1;

/**
 * @title: Calculator_v1
 * @description: 计算器 工厂方法模式
 * @auther: zjyun
 * @date: 2019/7/11 22:49
 */
public class Calculator_v1 {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation_v1 operationV1 = factory.createOperation();
        StringBuilder res = operationV1.calc(34,45);
        System.out.println(res);
    }
}
