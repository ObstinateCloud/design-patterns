package com.lengedyun.cash.version2;

/**
 * @author zjy
 * @title: NormalCash
 * @projectName design-patterns
 * @description: 正常收费
 * @date 2019/6/30 16:28
 */
public class NormalCash extends CashSuper{

    @Override
    public double acceptCash(int money) {

        return money;
    }
}
