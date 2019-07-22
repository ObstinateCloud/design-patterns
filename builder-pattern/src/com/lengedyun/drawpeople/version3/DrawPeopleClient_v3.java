package com.lengedyun.drawpeople.version3;

import com.lengedyun.drawpeople.version1.Graphics_v1;
import com.lengedyun.drawpeople.version1.Pen_v1;
import com.lengedyun.drawpeople.version2.FatPeopleBuilder;
import com.lengedyun.drawpeople.version2.ThinPeopleBuilder;

/**
 * @title: DrawPeopleClient_v1
 * @description: 建造者模式 将通用的过程抽象到父类
 * @auther: zjyun
 * @date: 2019/7/22 22:40
 */
public class DrawPeopleClient_v3 {

    public static void main(String[] args) {
        System.out.println("-----------画小人儿系统启动----------");
        Pen_v1 pen_v1 = new Pen_v1("黑色");
        Graphics_v1 graphicsV1 = new Graphics_v1();
        ThinPeopleBuilder thinPeopleBuilder = new ThinPeopleBuilder(pen_v1,graphicsV1);
        thinPeopleBuilder.build();
        FatPeopleBuilder fatPeopleBuilder = new FatPeopleBuilder(pen_v1,graphicsV1);
        fatPeopleBuilder.build();
    }
}
