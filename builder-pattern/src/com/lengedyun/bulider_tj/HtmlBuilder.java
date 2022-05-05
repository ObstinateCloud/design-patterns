package com.lengedyun.bulider_tj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @title: TestBuilder
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/5/5 18:25
 */
public class HtmlBuilder extends Builder {

    private String fileName;

    private PrintWriter writer;


    @Override
    protected void makeTitle(String title) {
        fileName = title+".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head> <meta charset=\"utf-8\"><title>"+title+"</title></head><body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    protected void makeString(String str) {
        writer.println("<p>"+str+"</p>");
    }

    @Override
    protected void makeItem(String[] items) {
        writer.println("<ul>");
        for (String item : items) {
            writer.println("<li>"+item+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
