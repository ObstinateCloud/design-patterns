package com.lengedyun.drawpeople.version1;

/**
 * @title: Graphics_v1
 * @description: 画板类
 * @auther: zjyun
 * @date: 2019/7/22 22:38
 */
public class Graphics_v1 {

    public void draw(Pen_v1 pen_v1,String desc){
        System.out.println(pen_v1.getColor()+"的画笔绘制，"+desc);
    }
}
