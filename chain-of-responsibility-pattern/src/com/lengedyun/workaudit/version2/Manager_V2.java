package com.lengedyun.workaudit.version2;

import com.lengedyun.workaudit.version1.WorkRequest_V1;

/**
 * @author zjy
 * @title: Manager_V1
 * @projectName design-patterns
 * @description: 抽象管理角色
 * @date 2019/10/4 10:54
 */
public abstract class Manager_V2 {

    protected String name;

    public Manager_V2(String name) {
        this.name = name;
    }

    protected Manager_V2 superior;

    public void setSuperior(Manager_V2 superior) {
        this.superior = superior;
    }

    public abstract void reqApply(WorkRequest_V1 workRequestV1);

}
