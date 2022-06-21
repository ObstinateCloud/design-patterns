package com.lengedyun.abstract_factory_tj.list_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsTray;
import com.lengedyun.abstract_factory_tj.factory.AbsItem;

import java.util.Iterator;

/**
 * @title: ConDiv
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 10:59
 */
public class ListTray extends AbsTray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator<AbsItem> iterator = items.iterator();
        while (iterator.hasNext()){
            AbsItem next = iterator.next();
            buffer.append(next.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
