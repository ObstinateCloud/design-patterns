package com.lengedyun.singleton.version2;

/**
 * @author zjy
 * @title: Singleton_V1_Lazy
 * @projectName design-patterns
 * @description: 单例模式 懒汉式多线程 粒度比较粗涉及性能问题
 * @date 2019/8/25 11:30
 */
public class Singleton_V2_Lazy_Multi {

    private static Singleton_V2_Lazy_Multi singletonV1;

    public synchronized static Singleton_V2_Lazy_Multi getInstance(){
        if(singletonV1 == null){
            singletonV1 = new Singleton_V2_Lazy_Multi();
        }
        return singletonV1;
    }

    private Singleton_V2_Lazy_Multi() {
    }
}
