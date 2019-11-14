package com.lengedyun.buildwebsite.version3;

import com.lengedyun.buildwebsite.version2.WebSiteFactory;
import com.lengedyun.buildwebsite.version2.WebSite_V2;

/**
 * @author zjy
 * @title: WebSiteClient
 * @projectName design-patterns
 * @description: 对象共享但无法满足多个用户隔离访问
 * @date 2019/11/12 7:33
 */
public class WebSiteClient_V3 {

    public static void main(String[] args) {
        WebSiteFactory_V3 factory = new WebSiteFactory_V3();

        WebSite_V3 webSiteV21 = factory.getWebSite("艺术");
        webSiteV21.use(new User("a"));

        WebSite_V3 webSiteV22 = factory.getWebSite("文学");
        webSiteV22.use(new User("b"));

        WebSite_V3 webSiteV23 = factory.getWebSite("博客");
        webSiteV23.use(new User("c"));
        System.out.println(webSiteV23);

        WebSite_V3 webSiteV24 = factory.getWebSite("博客");
        webSiteV24.use(new User("d"));
        System.out.println(webSiteV23);

        System.out.println(factory.getWebSiteCount());

    }
}
