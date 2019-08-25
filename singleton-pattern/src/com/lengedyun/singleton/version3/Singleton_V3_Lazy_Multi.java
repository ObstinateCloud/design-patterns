package com.lengedyun.singleton.version3;

/**
 * @author zjy
 * @title: Singleton_V1_Lazy
 * @projectName design-patterns
 * @description: 单例模式 懒汉式多线程 降低锁的粒度 但无法做到真正线程安全
 * @date 2019/8/25 11:30
 */
public class Singleton_V3_Lazy_Multi {

    private static Singleton_V3_Lazy_Multi singletonV1;

    public synchronized static Singleton_V3_Lazy_Multi getInstance(){
        if(singletonV1 == null){
            synchronized (Singleton_V3_Lazy_Multi.class){
                singletonV1 = new Singleton_V3_Lazy_Multi();
            }

        }
        return singletonV1;
    }

    private Singleton_V3_Lazy_Multi() {
    }
}
