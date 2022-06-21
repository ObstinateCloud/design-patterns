package com.lengedyun.abstract_factory_tj.factory;

/**
 * @title: AbsItem
 * @description: 标识网页中标签的父类 如link,image,ul等
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:20
 */
public abstract class AbsItem {
    //说明
    protected String caption;

    public AbsItem(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
