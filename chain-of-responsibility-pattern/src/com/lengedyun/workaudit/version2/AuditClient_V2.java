package com.lengedyun.workaudit.version2;

import com.lengedyun.workaudit.version1.WorkRequest_V1;

/**
 * @author zjy
 * @title: AuditClient
 * @projectName design-patterns
 * @description: 审核系统
 * 职责链模式
 * @date 2019/10/4 10:55
 */
public class AuditClient_V2 {

    public static void main(String[] args) {
        System.out.println("-------------审核系统v2.0----------");
        Manager_V2 jingli = new CommonManager("精力");
        Manager_V2 zongjian = new Majordomo("纵剪");
        Manager_V2 zongjingli = new GeneralManager("总尽力");

        jingli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        WorkRequest_V1 workRequest_v1 = new WorkRequest_V1();
        workRequest_v1.setReqNum(500);
        workRequest_v1.setReqType("加薪");
        workRequest_v1.setReqContent("菜鸟请求加薪");

        jingli.reqApply(workRequest_v1);

        WorkRequest_V1 workRequest_v2 = new WorkRequest_V1();
        workRequest_v2.setReqNum(5);
        workRequest_v2.setReqType("请假");
        workRequest_v2.setReqContent("菜鸟请求请假");

        jingli.reqApply(workRequest_v2);
    }
}
