package com.lengedyun.barbecuer.version1;

/**
 * @author zjy
 * @title: Barbecuer_V1
 * @projectName design-patterns
 * @description: 烧烤摊经营模式
 * @date 2019/9/22 17:20
 */
public class Barbecuer_V1 {

    private String name;

    public Barbecuer_V1(String name) {
        this.name = name;
        System.out.println(name+"需求");
    }

    public void bakeMutton(int num){
        System.out.println("烤"+num+"羊肉串");
    }

    public void bakeChickenWing(int num){
        System.out.println("烤"+num+"鸡翅");
    }
}
