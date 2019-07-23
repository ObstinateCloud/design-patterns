package com.lengedyun.builder;

/**
 * @title: ConcreateBulider1
 * @description: 具体建造者1
 * @auther: zjyun
 * @date: 2019/7/24 7:00
 */
public class ConcreateBulider1 extends Builder{

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("部件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
