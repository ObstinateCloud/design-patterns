package com.lengedyun.abstract_factory_tj.table_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsTray;
import com.lengedyun.abstract_factory_tj.factory.AbsItem;

import java.util.Iterator;

/**
 * @title: TableDiv
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 13:55
 */
public class TableTray extends AbsTray {


    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append(caption + "\n");
        buffer.append("<table width=\'100%\' border=\'1\'><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + items.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator<AbsItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            AbsItem next = iterator.next();
            buffer.append(next.makeHtml());
        }
        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}
