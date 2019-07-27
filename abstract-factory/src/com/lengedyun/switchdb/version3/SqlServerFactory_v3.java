package com.lengedyun.switchdb.version3;

import com.lengedyun.switchdb.version2.IFactory_v2;
import com.lengedyun.switchdb.version2.IUser_v2;
import com.lengedyun.switchdb.version2.SqlServerUser_v2;

/**
 * @author zjy
 * @title: SqlServerFactory_v2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/27 17:17
 */
public class SqlServerFactory_v3 implements IFactory_v3{


    @Override
    public IUser_v2 createIuser() {
        return new SqlServerUser_v2();
    }

    @Override
    public IDepartment_v3 createIDepartment() {
        return new SqlServerDepartment_v3();
    }
}
