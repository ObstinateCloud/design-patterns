package com.lengedyun.buildwebsite.verison1;

/**
 * @author zjy
 * @title: WebSiteClient1
 * @projectName design-patterns
 * @description: 需要做多个类似的网站
 * @date 2019/11/12 6:48
 */
public class WebSiteClient1 {

    public static void main(String[] args) {
        WebSite_V1 webSiteV11 = new WebSite_V1("博客类");
        webSiteV11.use();

        WebSite_V1 webSiteV12 = new WebSite_V1("新闻类");
        webSiteV12.use();

        WebSite_V1 webSiteV13 = new WebSite_V1("展示类");
        webSiteV13.use();
    }
}
