package com.lengedyun.memento;

/**
 * @author zjy
 * @title: MementoClient
 * @projectName design-patterns
 * @description: 备忘录模式客户端
 * @date 2019/8/24 11:28
 */
public class MementoClient {

    public static void main(String[] args) {
        System.out.println("--------------备忘录模式客户端------------");
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMenento());

        originator.setState("off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();


    }
}
