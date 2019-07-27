package com.lengedyun.switchdb.version3;

import com.lengedyun.switchdb.version1.User;
import com.lengedyun.switchdb.version2.AccessFactory_v2;
import com.lengedyun.switchdb.version2.IFactory_v2;
import com.lengedyun.switchdb.version2.IUser_v2;
import com.lengedyun.switchdb.version2.SqlServerFactory_v2;

/**
 * @author zjy
 * @title: SwitchDbClient_v2
 * @projectName design-patterns
 * @description: 切换数据库 抽象工厂模式 一系列抽象接口的组合
 * 缺点：增加一个类型就要增加大量接口和实现
 * @date 2019/7/27 16:56
 */
public class SwitchDbClient_v3 {

    public static void main(String[] args) {
        System.out.println("---------------------切换数据库------------------");
        IFactory_v3 factory_v3 = new SqlServerFactory_v3();
        //替换时只需替换此处即可
        //IFactory_v3 factory_v3 = new AccessFactory_v3();
        IUser_v2 accessUser = factory_v3.createIuser();
        IDepartment_v3 accessDepartment = factory_v3.createIDepartment();
        accessUser.insert(new User(1,"zjy"));
        accessUser.getUser(2);
        accessDepartment.insert(new Department(1,"IT"));
        accessDepartment.getDepartment(3);
    }
}
