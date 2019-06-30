package com.lengedyun.cash.version2;

/**
 * @author zjy
 * @title: ReturnCash
 * @projectName design-patterns
 * @description: 返利收费 满减
 * @date 2019/6/30 16:31
 */
public class ReturnCash extends CashSuper{
    //满
    private int full;
    //减
    private int sub;

    @Override
    public double acceptCash(int money) {
        return money > full ? money-sub:money;
    }

    public ReturnCash(int full, int sub) {
        this.full = full;
        this.sub = sub;
    }
}
