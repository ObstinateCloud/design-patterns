package com.lengedyun.facade;

import java.lang.reflect.Method;

/**
 * @title: Facade
 * @description: 统一的出入口  提供多种类方法的组合
 * @auther: zjyun
 * @date: 2019/7/22 22:11
 */
public class Facade {

    private SubSystem1 subSystem1;

    private SubSystem2 subSystem2;

    private SubSystem3 subSystem3;

    private SubSystem4 subSystem4;

    public Facade(){
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
        subSystem4 = new SubSystem4();
    }

    public void methodA(){
        subSystem1.method1();
        subSystem2.method2();
    }

    public void methodB(){
        subSystem3.method3();
        subSystem4.method4();
    }

}
