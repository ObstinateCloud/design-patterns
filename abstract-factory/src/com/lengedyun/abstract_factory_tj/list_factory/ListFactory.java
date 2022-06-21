package com.lengedyun.abstract_factory_tj.list_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsTray;
import com.lengedyun.abstract_factory_tj.factory.AbsFactory;
import com.lengedyun.abstract_factory_tj.factory.AbsLink;
import com.lengedyun.abstract_factory_tj.factory.AbsPage;

/**
 * @title: ConFactory
 * @description: 具体工厂类
 * @auther: zhangjianyun
 * @date: 2022/6/21 10:58
 */
public class ListFactory extends AbsFactory {


    @Override
    public AbsLink createLink(String url, String caption) {
        return new ListLink(caption,url);
    }

    @Override
    public AbsPage createPage(String title, String author) {
        return new ListPage(title,author);
    }

    @Override
    public AbsTray createTray(String caption) {
        return new ListTray(caption);
    }
}
