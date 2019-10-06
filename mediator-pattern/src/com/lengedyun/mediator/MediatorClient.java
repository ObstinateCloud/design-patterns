package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: MediatorClient
 * @projectName design-patterns
 * @description: 中介者客户端
 * @date 2019/10/6 14:14
 */
public class MediatorClient {

    public static void main(String[] args) {
        System.out.println("----------------中介者客户端--------------");
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(concreteMediator);

        concreteMediator.setColleague1(colleague1);
        concreteMediator.setColleague2(colleague2);

        colleague1.send("吃饭了吗");
        colleague2.send("睡觉了吗");

    }
}
