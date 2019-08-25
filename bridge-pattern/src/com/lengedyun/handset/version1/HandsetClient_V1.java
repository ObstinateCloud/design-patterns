package com.lengedyun.handset.version1;

/**
 * @author zjy
 * @title: HandsetClient_V1
 * @projectName design-patterns
 * @description: 手机客户端 紧耦合 每种手机游戏只能运行在特定的客户端上 两种游戏
 * @date 2019/8/25 13:47
 */
public class HandsetClient_V1 {

    public static void main(String[] args) {
        System.out.println("----------手机客户端----------");
        HandsetNGame_V1 handsetNGame_v1 = new HandsetNGame_V1();
        handsetNGame_v1.run();

        HandsetMGame_V1 handsetMGame_v1 = new HandsetMGame_V1();
        handsetMGame_v1.run();
    }
}
