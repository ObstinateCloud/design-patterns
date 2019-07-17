package com.lengedyun.templatemethod;

/**
 * @title: AbstractClass
 * @description: 父类封装 公共的算法或者流程 步骤中的细节让子类自己处理
 * @auther: zjyun
 * @date: 2019/7/18 6:41
 */
public abstract class AbstractClass {

    public abstract void operation1();

    public abstract void operation2();

    public void templateMethod(){
        operation1();
        operation2();
    }
}
