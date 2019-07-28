package com.lengedyun.adapter;

/**
 * @author zjy
 * @title: AdapterClient
 * @projectName design-patterns
 * @description: 适配器客户端
 * @date 2019/7/28 17:14
 */
public class AdapterClient {

    public static void main(String[] args) {
        System.out.println("-----------适配器模式--------");
        Target target = new Adapter();
        target.normalRequest();
        Target target1 = new ConcreteTarget();
        target1.normalRequest();
    }
}
