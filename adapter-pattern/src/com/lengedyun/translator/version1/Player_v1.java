package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: Player_v1
 * @projectName design-patterns
 * @description: 抽象球员类 前锋 中锋 后卫
 * @date 2019/7/28 16:00
 */
public abstract class Player_v1 {

    protected String name;

    public Player_v1(String name) {
        this.name = name;
    }

    //进攻
    public abstract void attack();

    //防守
    public abstract void defense();
}
