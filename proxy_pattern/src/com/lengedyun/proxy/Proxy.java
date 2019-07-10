package com.lengedyun.proxy;

/**
 * @title: Proxy
 * @description: 代理类保存着真实对象的引用，可以代替真实对象
 * @auther: zjyun
 * @date: 2019/7/10 20:04
 */
public class Proxy extends Subject{

    RealSubject realSubject;

    @Override
    public void request() {

        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
