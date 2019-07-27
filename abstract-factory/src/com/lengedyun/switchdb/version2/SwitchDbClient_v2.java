package com.lengedyun.switchdb.version2;

import com.lengedyun.switchdb.version1.User;

/**
 * @author zjy
 * @title: SwitchDbClient_v2
 * @projectName design-patterns
 * @description: 切换数据库 工厂方法模式
 * @date 2019/7/27 16:56
 */
public class SwitchDbClient_v2 {

    public static void main(String[] args) {
        System.out.println("---------------------切换数据库------------------");
        IFactory_v2 access = new AccessFactory_v2();
        IUser_v2 accessUser = access.createIuser();
        accessUser.getUser(1);
        User zjy1 = new User(2,"zjy");
        accessUser.insert(zjy1);

        IFactory_v2 sqlServer = new SqlServerFactory_v2();
        IUser_v2 sqlServerUser = sqlServer.createIuser();
        sqlServerUser.getUser(3);
        User zjy2 = new User(5,"zjy5");
        sqlServerUser.insert(zjy2);

    }
}
