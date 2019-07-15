package com.lengedyun.factorymethod;

/**
 * @title: ExtFactory1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/15 22:48
 */
public class ExtFactory2 implements IBaseFactory{

    @Override
    public Base createBase() {
        return new Ext2();
    }
}
