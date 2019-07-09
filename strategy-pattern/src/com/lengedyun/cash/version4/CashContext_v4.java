package com.lengedyun.cash.version4;

import com.lengedyun.cash.version2.CashSuper;
import com.lengedyun.cash.version2.DisconutCash;
import com.lengedyun.cash.version2.NormalCash;
import com.lengedyun.cash.version2.ReturnCash;
import com.lengedyun.cash.version3.CashContext_v3;

/**
 * @author zjy
 * @title: CashContext_v3
 * @projectName design-patterns
 * @description: 收银策略上下文
 * @date 2019/6/30 17:21
 */
public class CashContext_v4 {

    private CashSuper cashSuper;

    public CashContext_v4(int type) {

        switch (type){
            case 1:
                cashSuper = new NormalCash();
                break;
            case 2:
                cashSuper = new DisconutCash(1);
                break;
            case 3:
                cashSuper = new ReturnCash(200,100);
                break;
        }
    }



    public double  cashInterface(int money){

        return cashSuper.acceptCash(money);
    }


}
