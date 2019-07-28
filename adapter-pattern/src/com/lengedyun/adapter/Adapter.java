package com.lengedyun.adapter;

/**
 * @author zjy
 * @title: Adapter
 * @projectName design-patterns
 * @description: 适配器类
 * @date 2019/7/28 17:09
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    public void normalRequest(){

        adaptee.specificRequest();
    }
}
