package com.lengedyun.memento;

/**
 * @author zjy
 * @title: CareTaker
 * @projectName design-patterns
 * @description: 管理者
 * @date 2019/8/24 11:23
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
