package com.lengedyun.prototype;

/**
 * @title: Client
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/16 7:00
 */
public class Client {

    public static void main(String[] args) {
        ConcreteProtoType1 p1 = new ConcreteProtoType1("zjy");
        ConcreteProtoType1 p2 = (ConcreteProtoType1) p1.cloneObj();
        System.out.println(p2.getId());
    }
}
