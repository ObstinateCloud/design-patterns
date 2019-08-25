package com.lengedyun.bridge;

/**
 * @author zjy
 * @title: Abstraction
 * @projectName design-patterns
 * @description: 顶级抽象
 * @date 2019/8/25 14:53
 */
public abstract class Abstraction {

    protected Implementor1 implementor1;

    protected Implementor2 implementor2;

    public void setImplementor1(Implementor1 implementor1) {
        this.implementor1 = implementor1;
    }

    public void setImplementor2(Implementor2 implementor2) {
        this.implementor2 = implementor2;
    }

    public abstract void operate();
}
