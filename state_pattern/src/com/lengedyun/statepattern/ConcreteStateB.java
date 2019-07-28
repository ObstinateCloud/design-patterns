package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: ConcreteStateB
 * @projectName design-patterns
 * @description: 具体状态B
 * @date 2019/7/28 15:43
 */
public  class ConcreteStateB extends State{


    @Override
    public void handel(Work work) {
        System.out.println("ConcreteStateB do Some");
        work.setCurrentState(new ConcreteStateC());
    }
}
