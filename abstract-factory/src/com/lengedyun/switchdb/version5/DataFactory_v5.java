package com.lengedyun.switchdb.version5;

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
 * @description: 反射改进 简单工厂
 * @date 2019/7/27 17:58
 */
public class DataFactory_v5 {

    public static final String AccessDepartment_v3  = "com.lengedyun.switchdb.version3.AccessDepartment_v3";
    public static final String SqlServerDepartment_v3  = "com.lengedyun.switchdb.version3.SqlServerDepartment_v3";
    public static final String AccessUser_v2  = "com.lengedyun.switchdb.version2.AccessUser_v2";
    public static final String SqlServerUser_v2  = "com.lengedyun.switchdb.version2.SqlServerUser_v2";

    public static IUser_v2 createIUser(String db){
        IUser_v2 iUserV2 = null;
        Class clazz = null;
        try {
            clazz = Class.forName(db);
            iUserV2 = (IUser_v2) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iUserV2;
    }

    public static IDepartment_v3 createIDepartment(String db){
        IDepartment_v3 iDepartmentV3 =null;
        Class clazz = null;
        try {
            clazz = Class.forName(db);
            iDepartmentV3 = (IDepartment_v3) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iDepartmentV3;
    }
}
