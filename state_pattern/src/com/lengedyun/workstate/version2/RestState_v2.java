package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: RestState_v2
 * @projectName design-patterns
 * @description: 休息状态 工作完成
 * @date 2019/7/28 12:21
 */
public class RestState_v2 extends State_v2 {

    @Override
    public void getWorkState(Work_v2 workV2) {
        System.out.println("当前时间" + workV2.getHuor() + ",工作搞定下班回家");
    }
}
