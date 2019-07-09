package com.lengedyun.cash.version2;

/**
 * @author zjy
 * @title: CashFactory
 * @projectName design-patterns
 * @description: 收费工厂
 * @date 2019/6/30 16:32
 */
public class CashFactory {

    public static CashSuper getCash(int cashType){
        CashSuper cashSuper = null;

        switch (cashType){

            case 1:
                cashSuper = new NormalCash();
                break;
            case 2:
                cashSuper = new DisconutCash(2);
                break;
            case 3:
                cashSuper = new ReturnCash(200,100);
                break;
        }
        return cashSuper;
    }
}
