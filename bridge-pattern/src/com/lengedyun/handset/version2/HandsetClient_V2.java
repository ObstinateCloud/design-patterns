package com.lengedyun.handset.version2;

/**
 * @author zjy
 * @title: HandsetClient_V2
 * @projectName design-patterns
 * @description: 手机客户端 紧耦合
 * 两种手机类M,N都有游戏和通讯录功能 全部使用继承实现
 * 缺点每增加一个手机品牌或者增加一个功能都要两处修改
 * @date 2019/8/25 13:47
 */
public class HandsetClient_V2 {

    public static void main(String[] args) {
        System.out.println("----------手机客户端----------");
        HandsetBrand_V2 handsetBrandV2;
        handsetBrandV2 = new HandsetMAddrList_V2();
        handsetBrandV2.run();

        handsetBrandV2 = new HandsetMGame_V2();
        handsetBrandV2.run();

        handsetBrandV2 = new HandsetNAddrList_V2();
        handsetBrandV2.run();

        handsetBrandV2 = new HandsetNGame_V2();
        handsetBrandV2.run();
    }
}
