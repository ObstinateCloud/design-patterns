package com.lengedyun.barbecuer.version2;


/**
 * @author zjy
 * @title: BarbecuerClient_V1
 * @projectName design-patterns
 * @description: 烧烤店经营模式 烧烤师父接受来自服务员的烤串需求
 * 缺点只能执行单条命令
 * @date 2019/9/22 17:23
 */
public class BarbecuerClient_V2 {

    public static void main(String[] args) {
        System.out.println("------烧烤摊系统启动V2----");
        //开店准备
        Barbecuer_V2 barbecuer_v2 = new Barbecuer_V2();
        Command_V2 commandV2_1 = new BakeChickenWingCommand(barbecuer_v2);
        Command_V2 commandV2_2 = new BakeChickenWingCommand(barbecuer_v2);
        Command_V2 commandV2_3 = new BakeMuttonCommand(barbecuer_v2);
        Waiter_V2 waiterV2 = new Waiter_V2();
        waiterV2.setOrder(commandV2_1);
        waiterV2.excuteNotify();
        waiterV2.setOrder(commandV2_2);
        waiterV2.excuteNotify();
        waiterV2.setOrder(commandV2_3);
        waiterV2.excuteNotify();
    }
}
