package com.lengedyun.prototype;

/**
 * @title: ConcreteProtoType1
 * @description: 具体原型
 * @auther: zjyun
 * @date: 2019/7/16 6:56
 */
public class ConcreteProtoType1 extends ProtoType{


    public ConcreteProtoType1(String id) {
        super(id);
    }

    @Override
    public ProtoType cloneObj() {
        try {
            return (ProtoType) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
