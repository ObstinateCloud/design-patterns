package com.lengedyun.facade;

/**
 * @title: FacadeClient
 * @description: 外观模式客户端 对外提供统一的形式
 * @auther: zjyun
 * @date: 2019/7/22 22:15
 */
public class FacadeClient {

    public static void main(String[] args) {
        System.out.println("---------外观模式------");
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
