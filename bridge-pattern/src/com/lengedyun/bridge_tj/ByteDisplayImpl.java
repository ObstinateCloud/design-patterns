package com.lengedyun.bridge_tj;

import java.util.Arrays;

/**
 * @title: ByteDisplayImpl
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/22 9:54
 */
public class ByteDisplayImpl extends DisplayImpl {

    private String string;

    public ByteDisplayImpl(String string) {
        this.string = string;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println(Arrays.toString(string.getBytes()));
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("*");
        for (int i = 0; i < string.length(); i++) {
            System.out.print("#");

        }
        System.out.println("*");
    }
}
