package com.lengedyun.factory_tj.idcard;

import com.lengedyun.factory_tj.framework.AbstractProduct;

public class IDCard extends AbstractProduct {

    private String owner;

    private int num;

    IDCard(String owner,int num) {
        System.out.println("make "+ owner+" IDCard");
        this.owner = owner;
        this.num = num;
    }

    @Override
    public void use() {
        System.out.println("use "+ owner+","+num+" IDCard");
    }

}
