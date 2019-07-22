package com.lengedyun.drawpeople.version3;

import com.lengedyun.drawpeople.version1.Graphics_v1;
import com.lengedyun.drawpeople.version1.Pen_v1;

/**
 * @title: PersonBuilder
 * @description: 将画小人儿的公共部分抽取出来
 * @auther: zjyun
 * @date: 2019/7/23 7:14
 */
public abstract class PersonBuilder {

    protected Graphics_v1 graphics_v1;

    protected Pen_v1 pen_v1;

    public PersonBuilder(Graphics_v1 graphics_v1, Pen_v1 pen_v1) {
        this.graphics_v1 = graphics_v1;
        this.pen_v1 = pen_v1;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
