package com.lengedyun.switchdb.version3;

/**
 * @author zjy
 * @title: IDepartment_v3
 * @projectName design-patterns
 * @description: 部门操作接口
 * @date 2019/7/27 17:23
 */
public interface IDepartment_v3 {

    void insert(Department department);

    Department getDepartment(Integer id);

}
