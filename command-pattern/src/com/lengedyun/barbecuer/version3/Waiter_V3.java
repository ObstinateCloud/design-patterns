package com.lengedyun.barbecuer.version3;

import com.lengedyun.barbecuer.version2.BakeMuttonCommand;
import com.lengedyun.barbecuer.version2.Command_V2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: Waiter_V2
 * @projectName design-patterns
 * @description: 服务员
 * @date 2019/10/3 9:07
 */
public class Waiter_V3 {

    private List<Command_V2> orders = new ArrayList<Command_V2>();

    //下单
    public void setOrder(Command_V2 command_v2){
        if(command_v2 instanceof BakeMuttonCommand){
            System.out.println("烤肉没了，请点别的");
        }else{
            orders.add(command_v2);
            System.out.println("增加订单:"+command_v2.toString()+",时间:"+ LocalTime.now());
        }
    }

    //执行通知
    public void excuteNotify(){
        for (Command_V2 order : orders) {
            order.excuteCommand();
        }
    }

    public void cancleOrder(Command_V2 command_v2){
        orders.remove(command_v2);
        System.out.println("取消订单:"+command_v2.toString()+",时间:"+ LocalTime.now());
    }
}
