package com.lengedyun.orgmanager.version1;

/**
 * @author zjy
 * @title: OrgManagerClient
 * @projectName design-patterns
 * @description: 组织机构管理
 * @date 2019/8/24 16:31
 */
public class OrgManagerClient {

    public static void main(String[] args) {
        System.out.println("------------组织机构管理---------");
        ConcreteCompany root = new ConcreteCompany("总部");
        root.add(new HRDepartment("总人事部"));
        root.add(new FinanceDepartment("总财务部"));
        ConcreteCompany henan = new ConcreteCompany("河南分公司");
        henan.add(new HRDepartment("人事部"));
        henan.add(new FinanceDepartment("财务部"));
        ConcreteCompany hebei = new ConcreteCompany("河北分公司");
        hebei.add(new HRDepartment("人事部"));
        hebei.add(new FinanceDepartment("财务部"));
        hebei.add(new ConcreteCompany("石家庄部"));
        root.add(hebei);
        root.add(henan);

        root.display(1);

    }
}
