package com.lengedyun.manandwoman.version2;

/**
 * @author zjy
 * @title: Marriage_V2
 * @projectName design-patterns
 * @description: 扩展增加婚姻状态
 * @date 2019/12/3 7:40
 */
public class Marriage_V2 extends Action_V2{

    @Override
    public void getManConclusion(Man_V2 concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+this.getClass().getSimpleName()
                +"时，感慨道：恋爱游戏终结时，有妻徒刑遥无期");
    }

    @Override
    public void getWoManConclusion(Woman_V2 concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+this.getClass().getSimpleName()
                +"时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安");
    }
}
