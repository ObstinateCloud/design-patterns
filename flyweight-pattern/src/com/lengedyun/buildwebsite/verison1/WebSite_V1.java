package com.lengedyun.buildwebsite.verison1;

/**
 * @author zjy
 * @title: WebSite_V1
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 6:45
 */
public class WebSite_V1 {

    private String name = "";

    public WebSite_V1(String name) {
        this.name = name;
    }

    public void use(){
        System.out.println("网站分类:"+name);
    }
}
