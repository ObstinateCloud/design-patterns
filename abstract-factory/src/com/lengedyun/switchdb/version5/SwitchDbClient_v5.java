package com.lengedyun.switchdb.version5;

import com.lengedyun.switchdb.version1.User;
import com.lengedyun.switchdb.version2.IUser_v2;
import com.lengedyun.switchdb.version3.Department;
import com.lengedyun.switchdb.version3.IDepartment_v3;
import com.lengedyun.switchdb.version4.DataFactory_v4;

/**
 * @author zjy
 * @title: SwitchDbClient_v2
 * @projectName design-patterns
 * @description: 切换数据库 简单工厂优化抽象工厂  反射获取
 * @date 2019/7/27 16:56
 */
public class SwitchDbClient_v5 {

    public static void main(String[] args) {
        System.out.println("---------------------切换数据库------------------");
        IUser_v2 iUserV2 = DataFactory_v5.createIUser(DataFactory_v5.SqlServerUser_v2);
        iUserV2.insert(new User(1, "zjy"));
        iUserV2.getUser(2);

        IDepartment_v3 iDepartmentV3 = DataFactory_v5.createIDepartment(DataFactory_v5.AccessDepartment_v3);
        iDepartmentV3.insert(new Department(1, "IT"));
        iDepartmentV3.getDepartment(3);
    }
}
