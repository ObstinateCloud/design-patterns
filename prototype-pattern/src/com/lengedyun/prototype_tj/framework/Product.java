package com.lengedyun.prototype_tj.framework;

/**
 *
 */
public interface Product extends Cloneable{

    void use(String s);

    Product createProduct();
}
