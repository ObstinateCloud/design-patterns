package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: StateClient
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/28 15:55
 */
public class StateClient {

    public static void main(String[] args) {
        System.out.println("--------------------状态模式-------------");
        Work work = new Work(new ConcreteStateA());
        work.doWork();
        work.setCurrentState(new ConcreteStateB());
        work.doWork();
        work.setCurrentState(new ConcreteStateC());
        work.doWork();
    }
}
