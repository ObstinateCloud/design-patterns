package com.lengedyun.mediator;

/**
 * @author zjy
 * @title: Colleague
 * @projectName design-patterns
 * @description: 抽象同事类
 * @date 2019/10/6 13:26
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
