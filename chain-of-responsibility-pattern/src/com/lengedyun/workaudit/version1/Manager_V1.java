package com.lengedyun.workaudit.version1;

/**
 * @author zjy
 * @title: Manager_V1
 * @projectName design-patterns
 * @description: 管理角色
 * @date 2019/10/4 10:54
 */
public class Manager_V1 {

    protected String name;

    public Manager_V1(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, WorkRequest_V1 workRequestV1) {
        if ("经理".equals(managerLevel)) {
            if ("请假".equals(workRequestV1.getReqType()) && workRequestV1.getReqNum() <= 2) {
                System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
            } else if("请假".equals(workRequestV1.getReqType())){
                System.out.println(name + ":" + workRequestV1.getReqContent() + "数量大于2，我无权审批");
            } else{
                System.out.println(name + ":" + workRequestV1.getReqContent() + "我无权审批");
            }
        }else if ("总监".equals(managerLevel)) {
            if ("请假".equals(workRequestV1.getReqType()) && workRequestV1.getReqNum() <= 5) {
                System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
            } else if("请假".equals(workRequestV1.getReqType())) {
                System.out.println(name + ":" + workRequestV1.getReqContent() + "数量大于5，我无权审批");
            } else{
                System.out.println(name + ":" + workRequestV1.getReqContent() + "我无权审批");
            }
        }else if ("总经理".equals(managerLevel)) {
            if ("请假".equals(workRequestV1.getReqType())) {
                System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
            } else if("加薪".equals(workRequestV1.getReqType()) && workRequestV1.getReqNum()<1000){
                System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
            }else{
                System.out.println(name + ":" + workRequestV1.getReqContent() + "做梦吧");
            }
        }

    }
}
