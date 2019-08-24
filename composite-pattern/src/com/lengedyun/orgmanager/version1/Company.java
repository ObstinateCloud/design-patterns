package com.lengedyun.orgmanager.version1;

/**
 * @author zjy
 * @title: Company
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/8/24 14:55
 */
public abstract class Company {


    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    //履行职责
    public abstract void lineOfDuty();
}
