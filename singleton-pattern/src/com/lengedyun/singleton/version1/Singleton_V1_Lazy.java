package com.lengedyun.singleton.version1;

/**
 * @author zjy
 * @title: Singleton_V1_Lazy
 * @projectName design-patterns
 * @description: 单例模式 懒汉式有线程安全问题
 * @date 2019/8/25 11:30
 */
public class Singleton_V1_Lazy {

    private static Singleton_V1_Lazy singletonV1;

    public static Singleton_V1_Lazy getInstance(){
        if(singletonV1 == null){
            singletonV1 = new Singleton_V1_Lazy();
        }
        return singletonV1;
    }

    private Singleton_V1_Lazy() {
    }
}
