package com.lengedyun.abstract_factory_tj.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @title: AbsPage
 * @description: 网页标签
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:24
 */
public abstract class AbsPage {

    public String title;

    public String author;

    public List<AbsItem> items = new ArrayList<>();

    public AbsPage(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void addItem(AbsItem absItem){
        this.items.add(absItem);
    }

    public void output(){
        String fileName = title+".html";
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(makeHTML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
