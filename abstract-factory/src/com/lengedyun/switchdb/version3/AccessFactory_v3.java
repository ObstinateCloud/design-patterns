package com.lengedyun.switchdb.version3;

import com.lengedyun.switchdb.version2.AccessUser_v2;
import com.lengedyun.switchdb.version2.IFactory_v2;
import com.lengedyun.switchdb.version2.IUser_v2;

/**
 * @author zjy
 * @title: AccessFactory_v2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/27 17:17
 */
public class AccessFactory_v3 implements IFactory_v3{


    @Override
    public IUser_v2 createIuser() {
        return new AccessUser_v2();
    }

    @Override
    public IDepartment_v3 createIDepartment() {
        return new AccessDepartment_v3();
    }
}
