package com.lengedyun.orgmanager.version1;

import com.lengedyun.orgmanager.version1.Company;

/**
 * @author zjy
 * @title: HRDepartment
 * @projectName design-patterns
 * @description: 人事部
 * @date 2019/8/24 16:10
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder connectSign = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            connectSign.append("-");
        }
        System.out.println(connectSign.toString()+name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"职责员工招聘");
    }
}
