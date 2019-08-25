package com.lengedyun.iterator;

/**
 * @author zjy
 * @title: Aggregate
 * @projectName design-patterns
 * @description: 聚集抽象类
 * @date 2019/8/25 8:43
 */
public abstract class Aggregate {

    public abstract MyIterator createIterator();
}
