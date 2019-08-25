package com.lengedyun.singleton.version4;

/**
 * @author zjy
 * @title: Singleton_V1_Lazy
 * @projectName design-patterns
 * @description: 单例模式 懒汉式多线程 内部类实现
 * @date 2019/8/25 11:30
 */
public class Singleton_V4_Lazy_Multi {


    private static class SingletonHolder{
        public final static Singleton_V4_Lazy_Multi singletonV4 = new Singleton_V4_Lazy_Multi();
    }

    public static Singleton_V4_Lazy_Multi getInstance(){

        return SingletonHolder.singletonV4;
    }

    private Singleton_V4_Lazy_Multi() {
    }
}
