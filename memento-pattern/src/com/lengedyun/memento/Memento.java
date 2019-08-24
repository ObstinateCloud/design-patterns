package com.lengedyun.memento;

/**
 * @author zjy
 * @title: Memento
 * @projectName design-patterns
 * @description: 备忘录
 * @date 2019/8/24 11:22
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


}
