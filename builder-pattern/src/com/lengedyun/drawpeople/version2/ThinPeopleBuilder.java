package com.lengedyun.drawpeople.version2;

import com.lengedyun.drawpeople.version1.Graphics_v1;
import com.lengedyun.drawpeople.version1.Pen_v1;

/**
 * @title: ThinPeopleBuilder
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/23 6:49
 */
public class ThinPeopleBuilder {

    private Pen_v1 pen_v1;

    private Graphics_v1 graphics_v1;

    public ThinPeopleBuilder(Pen_v1 pen_v1, Graphics_v1 graphics_v1) {
        this.pen_v1 = pen_v1;
        this.graphics_v1 = graphics_v1;
    }

    public void build(){
        System.out.println("画一个瘦小人儿");
        graphics_v1.draw(pen_v1,"小头");
        graphics_v1.draw(pen_v1,"瘦左手");
        graphics_v1.draw(pen_v1,"瘦右手");
        graphics_v1.draw(pen_v1,"瘦左脚");
        graphics_v1.draw(pen_v1,"瘦右脚");
    }
}
