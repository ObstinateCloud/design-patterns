package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: Mediator
 * @projectName design-patterns
 * @description: 具体中介类
 * @date 2019/10/6 13:26
 */
public class ConcreteMediator extends Mediator{

    private ConcreteColleague1 colleague1;

    private ConcreteColleague2 colleague2;


    @Override
    public void sendMsg(String msg, Colleague colleague) {
        if(colleague instanceof ConcreteColleague1){
            colleague2.notifyMsg(msg);
        }else if(colleague instanceof ConcreteColleague2){
            colleague1.notifyMsg(msg);
        }
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}
