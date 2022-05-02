package com.lengedyun.factory_tj;

import com.lengedyun.factory_tj.framework.AbstractFactory;
import com.lengedyun.factory_tj.framework.AbstractProduct;
import com.lengedyun.factory_tj.idcard.IDCard;
import com.lengedyun.factory_tj.idcard.IDCardFactory;

public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new IDCardFactory();
        AbstractProduct product =factory.createProduct("zjy");
        AbstractProduct product1 =factory.createProduct("zjy1");
        AbstractProduct product2 =factory.createProduct("zjy2");
        product.use();
        product1.use();
        product2.use();

    }
}
