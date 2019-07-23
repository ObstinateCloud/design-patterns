package com.lengedyun.builder;

/**
 * @title: Builder
 * @description: 抽象建造者
 * @auther: zjyun
 * @date: 2019/7/24 6:58
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();

}
