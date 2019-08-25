package com.lengedyun.singleton.version1;

/**
 * @author zjy
 * @title: SingletonClient_V1
 * @projectName design-patterns
 * @description: 懒汉式单例模式
 * @date 2019/8/25 11:34
 */
public class SingletonClient_V1 {

    public static void main(String[] args) {
        System.out.println("-------------懒汉式单例模式--------------");
        Singleton_V1_Lazy singletonV1_1 = Singleton_V1_Lazy.getInstance();
        Singleton_V1_Lazy singletonV1_2 = Singleton_V1_Lazy.getInstance();
        System.out.println(singletonV1_1==singletonV1_2);
        System.out.println("-------------饿汉式单例模式--------------");
        Singleton_V1_Hungry singletonV1_3 = Singleton_V1_Hungry.getInstance();
        Singleton_V1_Hungry singletonV1_4 = Singleton_V1_Hungry.getInstance();
        System.out.println(singletonV1_3==singletonV1_4);
    }
}
