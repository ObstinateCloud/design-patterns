package com.lengedyun.workaudit.version2;

import com.lengedyun.workaudit.version1.WorkRequest_V1;

/**
 * @author zjy
 * @title: CommonManager
 * @projectName design-patterns
 * @description: 总经理
 * @date 2019/10/4 12:21
 */
public class GeneralManager extends Manager_V2 {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void reqApply(WorkRequest_V1 workRequestV1) {
        if ("请假".equals(workRequestV1.getReqType())) {
            System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
        } else if ("加薪".equals(workRequestV1.getReqType()) && workRequestV1.getReqNum() < 1000) {
            System.out.println(name + ":" + workRequestV1.getReqContent() + "被批准");
        } else if("加薪".equals(workRequestV1.getReqType())){
            System.out.println(name + ":" + workRequestV1.getReqContent() + "做梦吧");
        }
    }
}
