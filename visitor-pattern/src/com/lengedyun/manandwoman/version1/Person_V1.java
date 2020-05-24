package com.lengedyun.manandwoman.version1;

/**
 * @author zjy
 * @title: Person_V1
 * @projectName design-patterns
 * @description: 人类抽象类
 * @date 2019/12/2 7:10
 */
public abstract class Person_V1 {

    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void getConclusion();
}
