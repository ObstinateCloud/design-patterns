package com.lengedyun.workaudit.version1;

/**
 * @author zjy
 * @title: WorkRequest_V1
 * @projectName design-patterns
 * @description: 工作请求
 * @date 2019/10/4 10:53
 */
public class WorkRequest_V1 {

    private String reqType;

    private String reqContent;

    private int reqNum;

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public int getReqNum() {
        return reqNum;
    }

    public void setReqNum(int reqNum) {
        this.reqNum = reqNum;
    }
}
