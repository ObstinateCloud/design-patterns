package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: ConcreteStateA
 * @projectName design-patterns
 * @description: 具体状态A
 * @date 2019/7/28 15:43
 */
public  class ConcreteStateA extends State{


    @Override
    public void handel(Work work) {
        System.out.println("ConcreteStateA do Some");
        work.setCurrentState(new ConcreteStateB());
    }
}
