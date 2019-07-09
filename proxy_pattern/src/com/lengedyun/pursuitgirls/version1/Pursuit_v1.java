package com.lengedyun.pursuitgirls.version1;

/**
 * @author zjy
 * @title: Pursuit_v1
 * @projectName design-patterns
 * @description: 追求者类
 * @date 2019/7/7 14:37
 */
public class Pursuit_v1 {

    Girl_v1 mm;

    public Pursuit_v1(Girl_v1 mm) {
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName()+"送你洋娃娃!");
    }

    public void giveFlowers(){
        System.out.println(mm.getName()+"送你鲜花!");
    }

    public void giveChocolate(){
        System.out.println(mm.getName()+"送你巧克力!");
    }
}
