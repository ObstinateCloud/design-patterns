package com.lengedyun.abstract_factory_tj.factory;

/**
 * @title: AbsLink
 * @description: 超链接标签
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:21
 */
public abstract class AbsLink extends AbsItem{
    //独有属性
    protected String url;

    public AbsLink(String caption,String url) {
        super(caption);
        this.url = url;
    }


}
