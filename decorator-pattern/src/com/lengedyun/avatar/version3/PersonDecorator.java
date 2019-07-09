package com.lengedyun.avatar.version3;

import com.lengedyun.avatar.version2.Finery;
import com.lengedyun.avatar.version2.Person_v2;

/**
 * @author zjy
 * @title: PersonDecorator
 * @projectName design-patterns
 * @description: 人物 装饰器
 * @date 2019/7/7 10:56
 */
public class PersonDecorator extends Person_v2{

    protected Person_v2 person;

    public void show(){
        if(person != null){
            person.show();
        }
    }

    //装饰
    public void decorate(Person_v2 person) {
        this.person = person;
    }
}
