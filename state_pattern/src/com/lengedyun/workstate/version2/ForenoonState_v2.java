package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: ForenoonState_v2
 * @projectName design-patterns
 * @description: 上午工作状态
 * @date 2019/7/28 12:21
 */
public class ForenoonState_v2 extends State_v2{

    @Override
    public void getWorkState(Work_v2 workV2) {
        if (workV2.getHuor() < 12) {
            System.out.println("当前时间" + workV2.getHuor() + ",上午工作精神百倍");
        }else{
            workV2.setStateV2(new NoonState_v2());
            workV2.doWork();
        }
    }
}
