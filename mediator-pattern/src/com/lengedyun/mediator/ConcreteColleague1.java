package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: ConcreteColleague1
 * @projectName design-patterns
 * @description: 具体同事类1
 * @date 2019/10/6 13:26
 */
public class ConcreteColleague1 extends Colleague{


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg){
        mediator.sendMsg(msg,this);
    }

    public void notifyMsg(String msg){
        System.out.println("同事1得到消息:"+msg);
    }
}
