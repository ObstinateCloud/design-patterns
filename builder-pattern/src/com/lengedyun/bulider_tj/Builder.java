package com.lengedyun.bulider_tj;

/**
 * @title: Builder
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/5/5 18:24
 */
public abstract class Builder {

    protected abstract void makeTitle(String title);

    protected abstract void makeString(String str);

    protected abstract void makeItem(String[] items);

    protected abstract void close();
}
