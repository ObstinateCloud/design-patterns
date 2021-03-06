package com.lengedyun.pursuitgirls.version3;

import com.lengedyun.pursuitgirls.version1.Girl_v1;
import com.lengedyun.pursuitgirls.version2.Proxy_v2;

/**
 * @author zjy
 * @title: PursuitgirlsClient_v1
 * @projectName design-patterns
 * @description: 追女孩系统 v3
 * 使用代理
 * @date 2019/7/7 14:35
 */
public class PursuitgirlsClient_v3 {

    public static void main(String[] args) {
        System.out.println("----------追女孩系统启动---------");
        Girl_v1 ajiao = new Girl_v1();
        ajiao.setName("ajiao");

        Proxy_v3 daili = new Proxy_v3(ajiao);
        daili.giveChocolate();
        daili.giveFlowers();
        daili.giveDolls();
        
    }
}