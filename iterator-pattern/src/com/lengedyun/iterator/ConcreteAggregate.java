package com.lengedyun.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: ConcreteAggregate
 * @projectName design-patterns
 * @description: 具体聚集对象类
 * @date 2019/8/25 8:47
 */
public class ConcreteAggregate extends Aggregate{

    private List<Object> items = new ArrayList<>();

    public int count(){
        return items.size();
    }

    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getItem(int index){
      return   items.get(index);
    }

    public void setItem(int index,Object value){
        items.add(index,value);
    }


}
