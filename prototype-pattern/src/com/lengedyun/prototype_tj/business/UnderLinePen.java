package com.lengedyun.prototype_tj.business;

import com.lengedyun.prototype_tj.framework.Product;

import java.nio.charset.StandardCharsets;

public class UnderLinePen implements Product {

    private char decochar;

    public UnderLinePen(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String str) {
        System.out.println(str);
        for (int i = 0; i < str.getBytes(StandardCharsets.UTF_8).length; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createProduct() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
