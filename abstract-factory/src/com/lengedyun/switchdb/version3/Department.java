package com.lengedyun.switchdb.version3;

/**
 * @author zjy
 * @title: Department
 * @projectName design-patterns
 * @description: 部门类
 * @date 2019/7/27 17:34
 */
public class Department {

    private Integer id;

    private String departName;

    public Department(Integer id, String departName) {
        this.id = id;
        this.departName = departName;
    }

    public Department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                '}';
    }
}
