package com.lengedyun.switchdb.version4;

import com.lengedyun.switchdb.version1.User;
import com.lengedyun.switchdb.version2.IUser_v2;
import com.lengedyun.switchdb.version3.Department;
import com.lengedyun.switchdb.version3.IDepartment_v3;

/**
 * @author zjy
 * @title: SwitchDbClient_v2
 * @projectName design-patterns
 * @description: 切换数据库 简单工厂优化抽象工厂
 * 缺点有大量switch
 * @date 2019/7/27 16:56
 */
public class SwitchDbClient_v4 {

    public static void main(String[] args) {
        System.out.println("---------------------切换数据库------------------");
       IUser_v2 iUserV2 = DataFactory_v4.createIUser(DataFactory_v4.ACCESS);
       iUserV2.insert(new User(1,"zjy"));
       iUserV2.getUser(2);

       IDepartment_v3 iDepartmentV3 = DataFactory_v4.createIDepartment(DataFactory_v4.SQLSERVER);
       iDepartmentV3.insert(new Department(1,"IT"));
       iDepartmentV3.getDepartment(3);
    }
}
