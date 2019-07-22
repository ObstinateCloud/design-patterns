package com.lengedyun.drawpeople.version3;

import com.lengedyun.drawpeople.version1.Graphics_v1;
import com.lengedyun.drawpeople.version1.Pen_v1;

/**
 * @title: FatPeopleBuilder_v3
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/23 6:49
 */
public class FatPeopleBuilder_v3 extends PersonBuilder{


    public FatPeopleBuilder_v3(Graphics_v1 graphics_v1, Pen_v1 pen_v1) {
        super(graphics_v1, pen_v1);
    }

    @Override
    public void buildHead() {
        graphics_v1.draw(pen_v1,"大头");
    }

    @Override
    public void buildBody() {
        graphics_v1.draw(pen_v1,"胖身体");
    }

    @Override
    public void buildArmLeft() {
        graphics_v1.draw(pen_v1,"胖左臂");
    }

    @Override
    public void buildArmRight() {
        graphics_v1.draw(pen_v1,"胖右臂");
    }

    @Override
    public void buildLegLeft() {
        graphics_v1.draw(pen_v1,"胖左腿");
    }

    @Override
    public void buildLegRight() {
        graphics_v1.draw(pen_v1,"胖右腿");
    }
}
