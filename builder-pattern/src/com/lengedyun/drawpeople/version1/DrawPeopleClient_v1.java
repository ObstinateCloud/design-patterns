package com.lengedyun.drawpeople.version1;

/**
 * @title: DrawPeopleClient_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/22 22:40
 */
public class DrawPeopleClient_v1 {

    public static void main(String[] args) {
        System.out.println("-----------画小人儿系统启动----------");
        System.out.println("画一个瘦小人儿");
        Pen_v1 pen_v1 = new Pen_v1("黑色");
        Graphics_v1 thinPeople = new Graphics_v1();
        thinPeople.draw(pen_v1,"小头");
        thinPeople.draw(pen_v1,"瘦左手");
        thinPeople.draw(pen_v1,"瘦右手");
        thinPeople.draw(pen_v1,"瘦左脚");
        thinPeople.draw(pen_v1,"瘦右脚");
        System.out.println("画一个胖小人儿");
        Graphics_v1 fatpaople = new Graphics_v1();
        fatpaople.draw(pen_v1,"大头");
        fatpaople.draw(pen_v1,"胖左手");
        fatpaople.draw(pen_v1,"胖右手");
        fatpaople.draw(pen_v1,"胖左脚");
        fatpaople.draw(pen_v1,"胖右脚");
    }
}
