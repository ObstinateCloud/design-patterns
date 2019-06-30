package com.lengedyun.cash.version3;

import com.lengedyun.cash.version2.CashSuper;

/**
 * @author zjy
 * @title: CashContext_v3
 * @projectName design-patterns
 * @description: 收银策略上下文
 * @date 2019/6/30 17:21
 */
public class CashContext_v3 {

    private CashSuper cashSuper;

    public CashContext_v3(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double  cashInterface(int money){

        return cashSuper.acceptCash(money);
    }

}
