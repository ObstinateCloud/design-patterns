package com.lengedyun.abstract_factory_tj;

import com.lengedyun.abstract_factory_tj.factory.AbsTray;
import com.lengedyun.abstract_factory_tj.factory.AbsFactory;
import com.lengedyun.abstract_factory_tj.factory.AbsLink;
import com.lengedyun.abstract_factory_tj.factory.AbsPage;

/**
 * @title: Test
 * @description: 抽象工厂测试
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:18
 */
public class Test {

    public static void main(String[] args) {
//        AbsFactory absFactory = AbsFactory.getInstance("com.lengedyun.abstract_factory_tj.list_factory.ListFactory");
        AbsFactory absFactory = AbsFactory.getInstance("com.lengedyun.abstract_factory_tj.table_factory.TableFactory");

        AbsLink people = absFactory.createLink("http://paper.people.com.cn/rmrb/html/2022-06/21/nbs.D110000renmrb_01.htm","人民日报");
        AbsLink gmw = absFactory.createLink("https://www.gmw.cn/","光明网");

        AbsTray news = absFactory.createTray("新闻");
        news.addItem(people);
        news.addItem(gmw);

        AbsLink qihu = absFactory.createLink("https://www.so.com/","360");
        AbsLink baidu = absFactory.createLink("https://www.baidu.com/","百度");
        AbsLink hao123 = absFactory.createLink("https://www.hao123.com/","好123");
        AbsLink sougou = absFactory.createLink("https://www.sogou.com/","搜狗");
        AbsTray search = absFactory.createTray("搜索");
        search.addItem(qihu);
        search.addItem(baidu);
        search.addItem(hao123);
        search.addItem(sougou);

        AbsPage page = absFactory.createPage("myweb","lengedyun");

        page.addItem(news);
        page.addItem(search);

        page.output();

    }
}
