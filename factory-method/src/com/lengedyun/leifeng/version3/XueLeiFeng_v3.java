package com.lengedyun.leifeng.version3;

import com.lengedyun.leifeng.version1.LeiFeng_v1;
import com.lengedyun.leifeng.version2.LeiFengSimpleFactory;

/**
 * @title: XueLeiFeng_v1
 * @description: 学雷锋 v2 两类人可以做，并不关注时志愿者还是大学生 工厂方法
 * @auther: zjyun
 * @date: 2019/7/12 6:48
 */
public class XueLeiFeng_v3 {

    public static void main(String[] args) {
        System.out.println("-------------学雷锋系统启动----------");
        ILeiFengFactory leiFengFactory = new UnderGraduateFactory();
        leiFengFactory.createLeiFeng("stu1").wash();
        leiFengFactory.createLeiFeng("stu2").sweep();



    }
}
