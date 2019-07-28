package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: ForeignCenter_v1
 * @projectName design-patterns
 * @description: 外籍中锋
 * @date 2019/7/28 16:04
 */
public class ForeignCenter_v1 {

    private String name;

    public ForeignCenter_v1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackChinese() {
        System.out.println("中锋"+name+"进攻");
    }

    public void defenseChinese() {
        System.out.println("中锋"+name+"防守");
    }
}
