package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: ConcreteColleague2
 * @projectName design-patterns
 * @description: 具体同事类2
 * @date 2019/10/6 13:26
 */
public class ConcreteColleague2 extends Colleague{


    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String msg){
        mediator.sendMsg(msg,this);
    }

    public void notifyMsg(String msg){
        System.out.println("同事2得到消息:"+msg);
    }
}
