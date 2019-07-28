package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: EveningState_v2
 * @projectName design-patterns
 * @description: 晚上工作状态  17<hour<21
 * @date 2019/7/28 12:21
 */
public class EveningState_v2 extends State_v2{

    @Override
    public void getWorkState(Work_v2 workV2) {
        if (workV2.isFinish()) {
            workV2.setStateV2(new RestState_v2());
            workV2.doWork();
        }else{
            if(workV2.getHuor()<20){
                System.out.println("当前时间" + workV2.getHuor() + ",加班中心情不爽");
            }else{
                workV2.setStateV2(new ForceOffWorkState_v2());
                workV2.doWork();
            }
        }
    }
}
