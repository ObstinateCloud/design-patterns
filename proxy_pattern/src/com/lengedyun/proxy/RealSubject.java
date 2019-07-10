package com.lengedyun.proxy;

/**
 * @title: RealSubject
 * @description: 真实对象
 * @auther: zjyun
 * @date: 2019/7/10 20:03
 */
public class RealSubject extends Subject{


    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}
