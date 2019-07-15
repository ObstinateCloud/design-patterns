package com.lengedyun.factorymethod;

/**
 * @title: Client
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/15 22:52
 */
public class Client {

    public static void main(String[] args) {

        //IBaseFactory factory = new ExtFactory1();
        IBaseFactory factory = new ExtFactory2();
        Base base  = factory.createBase();
        base.printClassName();
    }
}
