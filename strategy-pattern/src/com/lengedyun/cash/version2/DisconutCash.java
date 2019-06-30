package com.lengedyun.cash.version2;

/**
 * @author zjy
 * @title: DisconutCash
 * @projectName design-patterns
 * @description: 打折收费
 * @date 2019/6/30 16:30
 */
public class DisconutCash extends CashSuper{
    //默认折扣
    private double discount = 1.0;

    @Override
    public double acceptCash(int money) {
        return discount * money;
    }

    public DisconutCash(int discountType) {
        this.setSiscount(discountType);
    }

    public void setSiscount(int type){
        switch (type){
            case 1:
                //正常收费
                break;
            case 2:
                //打 7 折
                this.discount = 0.7;
                break;
            case 3:
                //打 5 折
                this.discount = 0.5;
                break;
        }
    }
}
