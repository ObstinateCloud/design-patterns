package com.lengedyun.barbecuer.version2;

/**
 * @author zjy
 * @title: Waiter_V2
 * @projectName design-patterns
 * @description: 服务员
 * @date 2019/10/3 9:07
 */
public class Waiter_V2 {

    private Command_V2 commandV2;

    //下单
    public void setOrder(Command_V2 command_v2){
        commandV2 = command_v2;
    }

    //执行通知
    public void excuteNotify(){
        commandV2.excuteCommand();
    }
}
