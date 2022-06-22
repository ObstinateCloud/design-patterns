package com.lengedyun.bridge_tj;

/**
 * @title: Display
 * @description: 桥
 * @auther: zhangjianyun
 * @date: 2022/6/21 17:39
 */
public class Display {
    //用于实现层次的扩展
    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open(){
        displayImpl.rawOpen();
    }

    public void print(){
        displayImpl.rawPrint();
    }

    public void close(){
        displayImpl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
