package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: Center_v1
 * @projectName design-patterns
 * @description: 中锋
 * @date 2019/7/28 16:04
 */
public class Center_v1 extends Player_v1{

    public Center_v1(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Center_v1"+name+"attack");
    }

    @Override
    public void defense() {
        System.out.println("Center_v1"+name+"defense");
    }
}
