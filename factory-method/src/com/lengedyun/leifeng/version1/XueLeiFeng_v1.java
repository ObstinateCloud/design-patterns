package com.lengedyun.leifeng.version1;

/**
 * @title: XueLeiFeng_v1
 * @description: 学雷锋 v1 要三个人来做这三件事儿
 * @auther: zjyun
 * @date: 2019/7/12 6:48
 */
public class XueLeiFeng_v1 {

    public static void main(String[] args) {
        System.out.println("-------------学雷锋系统启动----------");
        LeiFeng_v1 student1 = new UnderGraduate("student1");
        student1.buyRice();
        LeiFeng_v1 student2 = new UnderGraduate("student2");
        student2.sweep();
        LeiFeng_v1 student3 = new UnderGraduate("student3");
        student3.wash();

    }
}
