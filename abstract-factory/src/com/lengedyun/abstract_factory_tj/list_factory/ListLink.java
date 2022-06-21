package com.lengedyun.abstract_factory_tj.list_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsLink;

/**
 * @title: ConLink
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 10:59
 */
public class ListLink extends AbsLink {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\" "+url+"\">"+caption+"</a></li>\n";
    }
}
