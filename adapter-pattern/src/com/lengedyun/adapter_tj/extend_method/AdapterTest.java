package com.lengedyun.adapter_tj.extend_method;

import java.sql.PreparedStatement;

/**
 * @title: AdapterTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/4/24 18:55
 */
public class AdapterTest {

    public static void main(String[] args) {
//        Print print = new PrintBanner(100);
        PrintBanner print = new PrintBanner(100);
        print.strong();
        print.weak();
        System.out.println("----------");
        Print printEntrust = new com.lengedyun.adapter_tj.entrust_method.PrintBanner(100);
        printEntrust.strong();
        printEntrust.weak();
    }
}
