package com.lengedyun.handset.version3;

import com.lengedyun.handset.version2.*;

/**
 * @author zjy
 * @title: HandsetClient_V3
 * @projectName design-patterns
 * @description: 手机客户端 松耦合 桥接模式 将抽象类与派生类分离
 * 两种手机类M,N都有游戏和通讯录功能  将应用与手机品牌分离
 * 应用作为手机的一部分
 * 此时增加一项功能或者增加一个品牌只需要增加一个类
 * @date 2019/8/25 13:47
 */
public class HandsetClient_V3 {

    public static void main(String[] args) {
        System.out.println("----------手机客户端v3----------");
        HandsetBrand_V3 handsetBrandV3;
        handsetBrandV3 = new HandsetBrandM_V3();
        handsetBrandV3.setHandsetAppV3(new HandsetAddrList_V3());
        handsetBrandV3.run();
        handsetBrandV3.setHandsetAppV3(new HandsetGame_V3());
        handsetBrandV3.run();

        handsetBrandV3 = new HandsetBrandN_V3();
        handsetBrandV3.setHandsetAppV3(new HandsetAddrList_V3());
        handsetBrandV3.run();
        handsetBrandV3.setHandsetAppV3(new HandsetGame_V3());
        handsetBrandV3.run();

        //扩展
        handsetBrandV3 = new HandsetBrandS_V3();
        handsetBrandV3.setHandsetAppV3(new HandsetAddrList_V3());
        handsetBrandV3.run();
        handsetBrandV3.setHandsetAppV3(new HandsetGame_V3());
        handsetBrandV3.run();
        handsetBrandV3.setHandsetAppV3(new HandsetMusic_V3());
        handsetBrandV3.run();

    }
}
