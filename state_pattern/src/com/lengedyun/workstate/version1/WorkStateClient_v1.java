package com.lengedyun.workstate.version1;

/**
 * @author zjy
 * @title: WorkStateClient_v1
 * @projectName design-patterns
 * @description: 工作状态随时间变化
 * 缺点：方法过长有大量重复，不符合单一职责
 * @date 2019/7/28 11:04
 */
public class WorkStateClient_v1 {

    public static void main(String[] args) {
        System.out.println("-----------------------工作状态随时间变化-----------------");
        Work_v1 workV1 = new Work_v1();
        workV1.setFinish(false);
        //workV1.setFinish(true);
        for (int i = 9; i < 25; i++) {
           workV1.doWork(i);
        }
    }
}
