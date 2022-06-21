package com.lengedyun.abstract_factory_tj.table_factory;

import com.lengedyun.abstract_factory_tj.factory.AbsItem;
import com.lengedyun.abstract_factory_tj.factory.AbsPage;

import java.util.Iterator;

/**
 * @title: TablePage
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/21 13:56
 */
public class TablePage extends AbsPage {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>");
        buffer.append("<table width=\'80%\' border=\'3\'>\n");
        Iterator<AbsItem> iterator = items.iterator();
        while (iterator.hasNext()){
            AbsItem next = iterator.next();
            buffer.append("<tr>"+next.makeHtml()+"</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }
}
