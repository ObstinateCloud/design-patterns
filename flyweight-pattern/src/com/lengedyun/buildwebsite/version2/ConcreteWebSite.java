package com.lengedyun.buildwebsite.version2;

/**
 * @author zjy
 * @title: ConcreteWebSite
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:21
 */
public class ConcreteWebSite extends WebSite_V2 {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类："+name);
    }
}
