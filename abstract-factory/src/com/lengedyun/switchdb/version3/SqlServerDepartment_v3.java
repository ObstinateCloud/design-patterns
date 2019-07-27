package com.lengedyun.switchdb.version3;

/**
 * @author zjy
 * @title: SqlServerDepartment_v3
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/27 17:11
 */
public class SqlServerDepartment_v3 implements IDepartment_v3 {


    @Override
    public void insert(Department department) {
        System.out.println("SqlServer 新增一条部门记录:"+department.toString());
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("SqlServer 查询一条部门记录id为："+id);
        return null;
    }
}
