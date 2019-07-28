package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: ForenoonState_v2
 * @projectName design-patterns
 * @description: 强制下班 超过八点
 * @date 2019/7/28 12:21
 */
public class ForceOffWorkState_v2 extends State_v2{

    @Override
    public void getWorkState(Work_v2 workV2) {
        if (workV2.getHuor() <22) {
            System.out.println("当前时间" + workV2.getHuor() + ",强制下班");
        }else{
            workV2.setStateV2(new SleepingState_v2());
            workV2.doWork();
        }
    }
}
