package com.lengedyun.abstract_factory_tj.table_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsLink;

/**
 * @title: TableLink
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 13:56
 */
public class TableLink extends AbsLink {


    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<td><a href=\" "+url+"\">"+caption+"</a></td>\n";
    }
}
