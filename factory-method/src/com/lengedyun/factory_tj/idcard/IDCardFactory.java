package com.lengedyun.factory_tj.idcard;

import com.lengedyun.factory_tj.framework.AbstractFactory;
import com.lengedyun.factory_tj.framework.AbstractProduct;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends AbstractFactory {

    List<IDCard> idCards = new ArrayList<>();


    private int num = 100;

    @Override
    protected void registerProduct(AbstractProduct abstractProduct) {
        idCards.add((IDCard) abstractProduct);
        System.out.println("数据库数据量："+idCards.size());
    }

    @Override
    public synchronized AbstractProduct createProduct(String name) {

        return new IDCard(name,num++);
    }

}
