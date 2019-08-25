package com.lengedyun.iterator;

/**
 * @author zjy
 * @title: IteratorClient
 * @projectName design-patterns
 * @description: 迭代器模式
 * @date 2019/8/25 8:59
 */
public class IteratorClient {

    public static void main(String[] args) {
        System.out.println("-------------------迭代器模式-----------------");

        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItem(0,"曹操");
        aggregate.setItem(1,"曹仁");
        aggregate.setItem(2,"曹真");
        aggregate.setItem(3,"曹爽");
        aggregate.setItem(4,"孙坚");
        aggregate.setItem(5,"孙测");
        aggregate.setItem(6,"孙权");

        //MyIterator iterator = new ConcreteIterator(aggregate);
        MyIterator iterator = new ConcreteIteratorDesc(aggregate);

        Object first = iterator.first();
        System.out.println("first:"+first);
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem()+" 请发炎");
            iterator.next();
        }

    }
}
