package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: State
 * @projectName design-patterns
 * @description: 抽象状态
 * @date 2019/7/28 15:43
 */
public abstract class State {

    public String name;

    public abstract void handel(Work work);
}
