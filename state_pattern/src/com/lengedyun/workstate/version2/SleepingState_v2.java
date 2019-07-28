package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: SleepingState_v2
 * @projectName design-patterns
 * @description: 睡眠状态 >21
 * @date 2019/7/28 12:21
 */
public class SleepingState_v2 extends State_v2 {

    @Override
    public void getWorkState(Work_v2 workV2) {
        System.out.println("当前时间" + workV2.getHuor() + ",困得不行了睡会儿");
    }
}
