package com.lengedyun.iterator;

/**
 * @author zjy
 * @title: ConcreteIterator
 * @projectName design-patterns
 * @description: 具体的迭代器 反向迭代器
 * @date 2019/8/25 8:45
 */
public class ConcreteIteratorDesc extends MyIterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getItem(current);
    }

    @Override
    public Object next() {
        Object retObj = null;
        current--;
        if (current >= 0) {
            retObj = aggregate.getItem(current);
        }
        return retObj;
    }

    @Override
    public boolean isDone() {

        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
