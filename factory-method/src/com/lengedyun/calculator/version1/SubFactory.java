package com.lengedyun.calculator.version1;

/**
 * @title: AddFactory
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/11 21:44
 */
public class SubFactory implements IFactory{

    @Override
    public Operation_v1 createOperation() {
        return new OperateSubExtend();
    }
}
