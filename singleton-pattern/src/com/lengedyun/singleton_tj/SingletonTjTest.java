package com.lengedyun.singleton_tj;

public class SingletonTjTest {

    public static void main(String[] args) {
        SingletonTj singletonTj = SingletonTj.getInstance();
        System.out.println(singletonTj);
        SingletonTj singletonTj1 = SingletonTj.getInstance();
        System.out.println(singletonTj1);
        System.out.println(singletonTj == singletonTj1);
        System.out.println(singletonTj.equals(singletonTj1));

    }
}
