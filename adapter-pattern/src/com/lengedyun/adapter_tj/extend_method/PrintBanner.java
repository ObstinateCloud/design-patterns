package com.lengedyun.adapter_tj.extend_method;

/**
 * @title: PrintBanner
 * @description: 基于继承方式实现  适配器类
 * @auther: zhangjianyun
 * @date: 2022/4/24 18:21
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(int volt) {
        super(volt);
    }

    @Override
    public void strong() {
        upVolt();

    }

    @Override
    public void weak() {
       downVolt();
    }
}
