package com.lengedyun.builder;

/**
 * @title: BuilderCilent
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/24 7:07
 */
public class BuilderCilent {

    public static void main(String[] args) {
        Builder builder1 = new ConcreateBulider1();
        Builder builder2 = new ConcreateBulider2();
        Director director = new Director();

        director.createProduct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        director.createProduct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
