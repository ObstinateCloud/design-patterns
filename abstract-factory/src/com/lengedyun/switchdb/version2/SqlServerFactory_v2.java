package com.lengedyun.switchdb.version2;

/**
 * @author zjy
 * @title: SqlServerFactory_v2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/27 17:17
 */
public class SqlServerFactory_v2 implements IFactory_v2{


    @Override
    public IUser_v2 createIuser() {
        return new SqlServerUser_v2();
    }
}
