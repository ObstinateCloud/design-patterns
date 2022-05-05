package com.lengedyun.bulider_tj;

/**
 * @title: TestBuilder
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/5/5 18:25
 */
public class TestBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();


    @Override
    protected void makeTitle(String title) {
        buffer.append("begin ==================\n");
        buffer.append("【"+title+"】\n");
        buffer.append("\n");
    }

    @Override
    protected void makeString(String str) {
        buffer.append("·····"+str+" \n");
        buffer.append("\n");
    }

    @Override
    protected void makeItem(String[] items) {
        for (String item : items) {
            buffer.append("·"+item+"\n");
        }
        buffer.append("\n");
    }

    @Override
    protected void close() {
        buffer.append("end ==================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
