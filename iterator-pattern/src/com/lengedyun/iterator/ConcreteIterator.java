package com.lengedyun.iterator;

/**
 * @author zjy
 * @title: ConcreteIterator
 * @projectName design-patterns
 * @description: 具体的迭代器
 * @date 2019/8/25 8:45
 */
public class ConcreteIterator extends MyIterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object retObj = null;
        current++;
        if(current< aggregate.count()){
            retObj = aggregate.getItem(current);
        }
        return retObj;
    }

    @Override
    public boolean isDone() {

        return current >= aggregate.count() ? true :false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
