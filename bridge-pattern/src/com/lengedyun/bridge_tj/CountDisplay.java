package com.lengedyun.bridge_tj;

/**
 * @title: CountDisplay
 * @description: 用于功能层次的扩展
 * @auther: zhangjianyun
 * @date: 2022/6/22 9:25
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
