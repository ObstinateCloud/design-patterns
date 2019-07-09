package com.lengedyun.avatar.version1;

/**
 * @author zjy
 * @title: Person_v1
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/7 10:39
 */
public class Person_v1 {

    private String name;

    public Person_v1(String name) {
        this.name = name;
    }

    public void wearTShirts() {
        System.out.println("穿T恤");
    }

    public void wearBigTrouser() {
        System.out.println("穿垮裤");
    }

    public void wearSneakers() {
        System.out.println("穿破球鞋");
    }

    public void wearSuit() {
        System.out.println("穿西装");
    }

    public void wearTie() {
        System.out.println("打领带");
    }

    public void wearLeatherShoes() {
        System.out.println("穿皮鞋");
    }

    public void show() {
        System.out.println("装扮的" + this.name);
    }

}
