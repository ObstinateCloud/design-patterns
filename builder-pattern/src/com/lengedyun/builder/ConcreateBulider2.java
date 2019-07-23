package com.lengedyun.builder;

/**
 * @title: ConcreateBulider1
 * @description: 具体建造者2
 * @auther: zjyun
 * @date: 2019/7/24 7:00
 */
public class ConcreateBulider2 extends Builder{

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("部件X");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
