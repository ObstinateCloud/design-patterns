package com.lengedyun.factory_tj.framework;

public abstract class AbstractFactory {

    protected final AbstractProduct create(String name){
        AbstractProduct product = createProduct(name);
        registerProduct(product);
        return product;
    };

    protected abstract void registerProduct(AbstractProduct abstractProduct);

    public abstract AbstractProduct createProduct(String name);


}
