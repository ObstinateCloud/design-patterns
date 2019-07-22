package com.lengedyun.drawpeople.version2;

import com.lengedyun.drawpeople.version1.Graphics_v1;
import com.lengedyun.drawpeople.version1.Pen_v1;

/**
 * @title: FatPeopleBuilder
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/23 6:49
 */
public class FatPeopleBuilder {

    private Pen_v1 pen_v1;

    private Graphics_v1 graphics_v1;

    public FatPeopleBuilder(Pen_v1 pen_v1, Graphics_v1 graphics_v1) {
        this.pen_v1 = pen_v1;
        this.graphics_v1 = graphics_v1;
    }

    public void build(){
        System.out.println("画一个胖小人儿");
        graphics_v1.draw(pen_v1,"大头");
        graphics_v1.draw(pen_v1,"胖左手");
        graphics_v1.draw(pen_v1,"胖右手");
        graphics_v1.draw(pen_v1,"胖左脚");
        graphics_v1.draw(pen_v1,"胖右脚");
    }
}
