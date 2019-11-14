package com.lengedyun.buildwebsite.version2;

/**
 * @author zjy
 * @title: WebSiteClient
 * @projectName design-patterns
 * @description: 对象共享但无法满足多个用户隔离访问
 * @date 2019/11/12 7:33
 */
public class WebSiteClient {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite_V2 webSiteV21 = factory.getWebSite("艺术");
        webSiteV21.use();

        WebSite_V2 webSiteV22 = factory.getWebSite("文学");
        webSiteV22.use();

        WebSite_V2 webSiteV23 = factory.getWebSite("博客");
        webSiteV23.use();
        System.out.println(webSiteV23);

        WebSite_V2 webSiteV24 = factory.getWebSite("博客");
        webSiteV24.use();
        System.out.println(webSiteV23);

        System.out.println(factory.getWebSiteCount());

    }
}
