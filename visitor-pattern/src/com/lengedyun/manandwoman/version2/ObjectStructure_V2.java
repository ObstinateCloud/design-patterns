package com.lengedyun.manandwoman.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: ObjectStructure_V2
 * @projectName design-patterns
 * @description: 对象结构
 * @date 2019/12/3 7:29
 */
public class ObjectStructure_V2 {

    private List<Person_V2> personV2s = new ArrayList<>();

    public void attach(Person_V2 person){
        personV2s.add(person);
    }

    public void detach(Person_V2 person){
        personV2s.remove(person);
    }

    public void display(Action_V2 visitor){
        personV2s.forEach(p->{
            p.accept(visitor);
        });
    }

}
