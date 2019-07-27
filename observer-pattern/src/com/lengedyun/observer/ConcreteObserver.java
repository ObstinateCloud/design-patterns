package com.lengedyun.observer;

/**
 * @author zjy
 * @title: ConcreteObserver
 * @projectName design-patterns
 * @description: 观察者/订阅者
 * @date 2019/7/27 12:17
 */
public class ConcreteObserver extends Observer {

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者:"+name+"的状态是"+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
