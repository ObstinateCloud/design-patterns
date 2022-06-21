package com.lengedyun.abstract_factory_tj.list_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsItem;
import com.lengedyun.abstract_factory_tj.factory.AbsPage;

import java.util.Iterator;

/**
 * @title: ConPage
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 11:00
 */
public class ListPage extends AbsPage {


    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>");
        buffer.append("<ul>\n");
        Iterator<AbsItem> iterator = items.iterator();
        while (iterator.hasNext()){
            AbsItem next = iterator.next();
            buffer.append(next.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}
