package com.lengedyun.barbecuer.version3;


import com.lengedyun.barbecuer.version2.*;

/**
 * @author zjy
 * @title: BarbecuerClient_V1
 * @projectName design-patterns
 * @description: 烧烤店经营模式 增加订单统计，缺货提示，取消订单
 * @date 2019/9/22 17:23
 */
public class BarbecuerClient_V3 {

    public static void main(String[] args) {
        System.out.println("------烧烤摊系统启动V2----");
        //开店准备
        Barbecuer_V2 barbecuer_v2 = new Barbecuer_V2();
        Command_V2 commandV2_1 = new BakeChickenWingCommand(barbecuer_v2);
        Command_V2 commandV2_2 = new BakeChickenWingCommand(barbecuer_v2);
        Command_V2 commandV2_3 = new BakeMuttonCommand(barbecuer_v2);
        Waiter_V3 waiterV3 = new Waiter_V3();
        waiterV3.setOrder(commandV2_1);
        waiterV3.setOrder(commandV2_2);
        waiterV3.setOrder(commandV2_3);
        waiterV3.excuteNotify();
    }
}
