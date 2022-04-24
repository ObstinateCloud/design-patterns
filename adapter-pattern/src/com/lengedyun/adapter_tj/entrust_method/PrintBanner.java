package com.lengedyun.adapter_tj.entrust_method;

import com.lengedyun.adapter_tj.extend_method.Banner;
import com.lengedyun.adapter_tj.extend_method.Print;

/**
 * @title: PrintBanner
 * @description: 基于继承方式实现  适配器类
 * @auther: zhangjianyun
 * @date: 2022/4/24 18:21
 */
public class PrintBanner implements Print{

    Banner banner;

    public PrintBanner(int volt) {

        banner = new Banner(volt);
    }

    @Override
    public void strong() {
        banner.upVolt();

    }

    @Override
    public void weak() {
        banner.downVolt();
    }
}
