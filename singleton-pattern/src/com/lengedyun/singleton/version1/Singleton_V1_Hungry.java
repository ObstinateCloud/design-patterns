package com.lengedyun.singleton.version1;

/**
 * @author zjy
 * @title: Singleton_V1_Lazy
 * @projectName design-patterns
 * @description: 单例模式 饿汉式 没有线程安全问题
 * @date 2019/8/25 11:30
 */
public class Singleton_V1_Hungry {

    private static Singleton_V1_Hungry singletonV1 = new Singleton_V1_Hungry();

    public static Singleton_V1_Hungry getInstance(){
        return singletonV1;
    }

    private Singleton_V1_Hungry() {
    }
}
