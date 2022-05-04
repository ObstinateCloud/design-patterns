package com.lengedyun.singleton_tj;

public class SingletonTj {

    private static SingletonTj singletonTj = new SingletonTj();

    private SingletonTj(){

    }

    public static SingletonTj getInstance(){
        return singletonTj;
    }
}
