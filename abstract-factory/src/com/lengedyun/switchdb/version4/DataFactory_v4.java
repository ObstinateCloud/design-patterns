package com.lengedyun.switchdb.version4;

import com.lengedyun.switchdb.version2.AccessUser_v2;
import com.lengedyun.switchdb.version2.IUser_v2;
import com.lengedyun.switchdb.version2.SqlServerUser_v2;
import com.lengedyun.switchdb.version3.AccessDepartment_v3;
import com.lengedyun.switchdb.version3.IDepartment_v3;
import com.lengedyun.switchdb.version3.SqlServerDepartment_v3;

/**
 * @author zjy
 * @title: DataFactory_v4
 * @projectName design-patterns
 * @description: 简单工厂改进 抽象工厂
 * @date 2019/7/27 17:58
 */
public class DataFactory_v4 {

    public static final String ACCESS = "Access";
    public static final String SQLSERVER = "SqlServer";

    public static IUser_v2 createIUser(String db){
        IUser_v2 iUserV2 =null;
        switch (db){
            case SQLSERVER:
                iUserV2 = new SqlServerUser_v2();
                break;
            case ACCESS:
                iUserV2 = new AccessUser_v2();
                break;
        }
        return iUserV2;
    }

    public static IDepartment_v3 createIDepartment(String db){
        IDepartment_v3 iDepartmentV3 =null;
        switch (db){
            case SQLSERVER:
                iDepartmentV3 = new SqlServerDepartment_v3();
                break;
            case ACCESS:
                iDepartmentV3 = new AccessDepartment_v3();
                break;
        }
        return iDepartmentV3;
    }
}
