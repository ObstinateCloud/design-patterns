package com.lengedyun.pursuitgirls.version1;

/**
 * @author zjy
 * @title: PursuitgirlsClient_v1
 * @projectName design-patterns
 * @description: 追女孩系统 v1
 * 存在问题 忽略了代理对象
 * @date 2019/7/7 14:35
 */
public class PursuitgirlsClient_v1 {

    public static void main(String[] args) {
        System.out.println("----------追女孩系统启动---------");
        Girl_v1 ajiao = new Girl_v1();
        ajiao.setName("ajiao");

        Pursuit_v1 daming = new Pursuit_v1(ajiao);
        daming.giveChocolate();
        daming.giveFlowers();
        daming.giveDolls();

    }
}