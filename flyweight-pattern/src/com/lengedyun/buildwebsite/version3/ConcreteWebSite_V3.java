package com.lengedyun.buildwebsite.version3;

import com.lengedyun.buildwebsite.version2.WebSite_V2;

/**
 * @author zjy
 * @title: ConcreteWebSite
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:21
 */
public class ConcreteWebSite_V3 extends WebSite_V3 {

    private String name;

    public ConcreteWebSite_V3(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类："+name+",用户名:"+user.getName());
    }
}
