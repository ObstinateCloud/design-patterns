package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: Guards_v1
 * @projectName design-patterns
 * @description: 后卫
 * @date 2019/7/28 16:04
 */
public class Guards_v1 extends Player_v1{

    public Guards_v1(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Guards_v1"+name+"attack");
    }

    @Override
    public void defense() {
        System.out.println("Guards_v1"+name+"defense");
    }
}
