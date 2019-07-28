package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: ConcreteStateC
 * @projectName design-patterns
 * @description: 具体状态C
 * @date 2019/7/28 15:43
 */
public  class ConcreteStateC extends State{


    @Override
    public void handel(Work work) {
        System.out.println("ConcreteStateC do Some");
    }
}
