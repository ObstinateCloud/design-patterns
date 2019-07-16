package com.lengedyun.prototype;

/**
 * @title: ProtoType
 * @description: 原型类  java中的对象克隆必须实现Cloneable接口
 * @auther: zjyun
 * @date: 2019/7/16 6:51
 */
public abstract class ProtoType implements Cloneable{

    private String id;

    public ProtoType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //最关键的克隆方法
    public abstract ProtoType cloneObj();
}
