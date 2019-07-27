package com.lengedyun.observer;

/**
 * @author zjy
 * @title: ObserverClient
 * @projectName design-patterns
 * @description: 观察者模式
 * @date 2019/7/27 12:28
 */
public class ObserverClient {

    public static void main(String[] args) {
        System.out.println("-----------------观察者模式-------------");
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver1 = new ConcreteObserver("zjy1",concreteSubject);
        ConcreteObserver concreteObserver2 = new ConcreteObserver("zjy2",concreteSubject);
        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);
        concreteSubject.setSubjectState("change");
        concreteSubject.notifyALL();

    }
}
