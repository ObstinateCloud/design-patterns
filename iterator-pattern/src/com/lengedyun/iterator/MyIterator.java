package com.lengedyun.iterator;

/**
 * @author zjy
 * @title: MyIterator
 * @projectName design-patterns
 * @description: 迭代器抽象类
 * @date 2019/8/24 17:38
 */
public abstract class MyIterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
