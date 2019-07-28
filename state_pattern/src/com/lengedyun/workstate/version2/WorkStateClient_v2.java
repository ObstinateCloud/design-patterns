package com.lengedyun.workstate.version2;


/**
 * @author zjy
 * @title: WorkStateClient_v2
 * @projectName design-patterns
 * @description: 工作状态随时间变化  状态模式将多个判断分离开 方便扩展减少耦合
 * 需求扩展20点强制下班
 * @date 2019/7/28 11:04
 */
public class WorkStateClient_v2 {

    public static void main(String[] args) {
        System.out.println("-----------------------工作状态随时间变化 新版-----------------");
        Work_v2 workV2 = new Work_v2();
        workV2.setFinish(false);
        //workV2.setFinish(true);
        for (int i = 9; i < 25; i++) {
            workV2.setHuor(i);
            workV2.doWork();
        }
    }
}
