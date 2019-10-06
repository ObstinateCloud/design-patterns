package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: Mediator
 * @projectName design-patterns
 * @description: 抽象中介类
 * @date 2019/10/6 13:26
 */
public abstract class Mediator {

    public abstract void sendMsg(String msg,Colleague colleague);
}
