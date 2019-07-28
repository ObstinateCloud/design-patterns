package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: AfternoonState_v2
 * @projectName design-patterns
 * @description: 下午工作状态
 * @date 2019/7/28 12:21
 */
public class AfternoonState_v2 extends State_v2{

    @Override
    public void getWorkState(Work_v2 workV2) {
        if (workV2.getHuor() < 17) {
            System.out.println("当前时间" + workV2.getHuor() + ",重新满血复活");
        }else{
            workV2.setStateV2(new EveningState_v2());
            workV2.doWork();
        }
    }
}
