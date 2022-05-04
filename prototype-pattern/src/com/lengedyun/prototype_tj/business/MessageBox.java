package com.lengedyun.prototype_tj.business;

import com.lengedyun.prototype_tj.framework.Product;

import java.nio.charset.StandardCharsets;

public class MessageBox implements Product {
    //占位字符
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String message) {
        int length = message.getBytes(StandardCharsets.UTF_8).length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar+ " "+ message+" "+decochar);
        for (int i = 0; i < length + 4; i++) {
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
