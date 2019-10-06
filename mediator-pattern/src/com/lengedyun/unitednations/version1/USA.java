package com.lengedyun.unitednations.version1;

/**
 * @author zjy
 * @title: USA
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/6 14:38
 */
public class USA extends Country_V1{

    public USA(UnitedNations_V1 unitedNationsV1) {
        super(unitedNationsV1);
    }

    public void sendMsg(String msg){
        unitedNationsV1.declare(msg,this);
    }

    public void notifyMsg(String msg){
        System.out.println("美国收到消息："+msg);
    }
}
