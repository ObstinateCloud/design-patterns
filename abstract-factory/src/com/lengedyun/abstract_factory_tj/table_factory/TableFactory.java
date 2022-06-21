package com.lengedyun.abstract_factory_tj.table_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsTray;
import com.lengedyun.abstract_factory_tj.factory.AbsFactory;
import com.lengedyun.abstract_factory_tj.factory.AbsLink;
import com.lengedyun.abstract_factory_tj.factory.AbsPage;

/**
 * @title: TableFactory
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 13:55
 */
public class TableFactory extends AbsFactory {
    @Override
    public AbsLink createLink(String url, String caption) {
        return new TableLink(caption, url);
    }

    @Override
    public AbsPage createPage(String title, String author) {
        return new TablePage(title, author);
    }

    @Override
    public AbsTray createTray(String caption) {
        return new TableTray(caption);
    }
}
