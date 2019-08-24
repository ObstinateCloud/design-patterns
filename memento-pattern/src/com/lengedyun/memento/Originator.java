package com.lengedyun.memento;

/**
 * @author zjy
 * @title: Originator
 * @projectName design-patterns
 * @description: 发起人
 * @date 2019/8/24 11:16
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMenento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("当前状态:"+state);
    }
}
