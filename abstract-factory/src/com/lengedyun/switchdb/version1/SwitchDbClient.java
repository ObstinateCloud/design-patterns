package com.lengedyun.switchdb.version1;

/**
 * @author zjy
 * @title: SwitchDbClient
 * @projectName design-patterns
 * @description: 切换数据库
 * @date 2019/7/27 16:56
 */
public class SwitchDbClient {

    public static void main(String[] args) {
        System.out.println("---------------------切换数据库------------------");
        User userV1 = new User(2,"zjy2");
        SqlServerUser sqlServerUser = new SqlServerUser();
        sqlServerUser.insert(userV1);
        System.out.println(sqlServerUser.getUser().toString());
    }
}
