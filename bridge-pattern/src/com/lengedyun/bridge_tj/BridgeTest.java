package com.lengedyun.bridge_tj;

/**
 * @title: BridgeTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/22 9:38
 */
public class BridgeTest {

    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello,Beijing"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello,China"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello,World"));
        CountDisplay display4 = new CountDisplay(new ByteDisplayImpl("Hello,World"));

        display1.display();
        display2.display();
        display3.display();
        display4.display();
        display3.multiDisplay(5);
        display4.multiDisplay(3);
    }
}
