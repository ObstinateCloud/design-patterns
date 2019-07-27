package com.lengedyun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: Subject
 * @projectName design-patterns
 * @description: 主题
 * @date 2019/7/27 12:06
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyALL() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
