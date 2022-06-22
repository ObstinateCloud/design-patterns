package com.lengedyun.bridge_tj;

/**
 * @title: StringDisplayImpl
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/22 9:30
 */
public class StringDisplayImpl extends DisplayImpl {

    private String string;

    //字符长度
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("| "+string+" |");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");

        }
        System.out.println("+");
    }
}
