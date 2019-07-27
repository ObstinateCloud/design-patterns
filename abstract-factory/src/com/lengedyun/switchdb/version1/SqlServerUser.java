package com.lengedyun.switchdb.version1;

/**
 * @author zjy
 * @title: SqlServerUser
 * @projectName design-patterns
 * @moduleName abstract-factory
 * @description: SqlServer 操作user表
 * @date 2019/7/27 16:49
 */
public class SqlServerUser {

    public void insert(User user_v1){
        System.out.println("SqlServer中新增记录"+user_v1.getUserName());
    }

    public User getUser(){
        User user_v1 = new User(1,"zjy");
        return user_v1;
    }
}
