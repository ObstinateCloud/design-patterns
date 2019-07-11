package com.lengedyun.leifeng.version2;

import com.lengedyun.leifeng.version1.LeiFeng_v1;
import com.lengedyun.leifeng.version1.UnderGraduate;

/**
 * @title: XueLeiFeng_v1
 * @description: 学雷锋 v2 两类人可以做，并不关注时志愿者还是大学生 简单工厂存在代码重复
 * @auther: zjyun
 * @date: 2019/7/12 6:48
 */
public class XueLeiFeng_v2 {

    public static void main(String[] args) {
        System.out.println("-------------学雷锋系统启动----------");
        LeiFeng_v1 student1 = LeiFengSimpleFactory.createLeiFeng(1,"student1");
        student1.buyRice();
        LeiFeng_v1 student2 = LeiFengSimpleFactory.createLeiFeng(2,"voluntteer1");
        student2.sweep();
        LeiFeng_v1 student3  = LeiFengSimpleFactory.createLeiFeng(1,"student2");;
        student3.wash();

    }
}
