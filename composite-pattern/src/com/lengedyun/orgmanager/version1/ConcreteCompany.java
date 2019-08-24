package com.lengedyun.orgmanager.version1;

import com.lengedyun.composite.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: ConcreteCompany
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/8/24 15:02
 */
public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder connectSign = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            connectSign.append("-");
        }
        System.out.println(connectSign.toString()+name);
        for (Company child : children) {
            child.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
