package com.lengedyun.workaudit.version1;

/**
 * @author zjy
 * @title: AuditClient
 * @projectName design-patterns
 * @description: 审核系统
 * @date 2019/10/4 10:55
 */
public class AuditClient {

    public static void main(String[] args) {
        System.out.println("-------------审核系统v1.0----------");
        Manager_V1 jingli = new Manager_V1("精力");
        Manager_V1 zongjian = new Manager_V1("纵剪");
        Manager_V1 zongjingli = new Manager_V1("总尽力");

        WorkRequest_V1 workRequest_v1 = new WorkRequest_V1();
        workRequest_v1.setReqNum(500);
        workRequest_v1.setReqType("加薪");
        workRequest_v1.setReqContent("菜鸟请求加薪");

        jingli.getResult("经理",workRequest_v1);
        zongjian.getResult("总监",workRequest_v1);
        zongjingli.getResult("总经理",workRequest_v1);

        WorkRequest_V1 workRequest_v2 = new WorkRequest_V1();
        workRequest_v2.setReqNum(5);
        workRequest_v2.setReqType("请假");
        workRequest_v2.setReqContent("菜鸟请求请假");

        jingli.getResult("经理",workRequest_v2);
        zongjian.getResult("总监",workRequest_v2);
        zongjingli.getResult("总经理",workRequest_v2);

    }
}
