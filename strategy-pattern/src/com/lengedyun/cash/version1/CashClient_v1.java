package com.lengedyun.cash.version1;

import java.util.Scanner;

/**
 * @author zjy
 * @title: CashClient_v1
 * @projectName design-patterns
 * @description: 收银系统 v1
 *  需求 1、根据输入单价和数量 计算商品价格
 *  需求 2、支持多种折扣
 *  需求 3、支持多种折扣
 * @date 2019/6/30 15:16
 */
public class CashClient_v1 {

    public static void main(String[] args) {
        System.out.println("收银系统启动····");
        byte exit = 1;
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double totals = 0;
        while (exit == 1){
            System.out.println("第 "+ count +"种商品");
            System.out.print("请输入单价:");
            int price = scanner.nextInt();
            System.out.print("请输入数量:");
            int num  = scanner.nextInt();
            System.out.print("请选择优惠方式(1;正常 2 打折 3 满减):");
            int type = scanner.nextInt();
            int normal = price * num;
            double total = getTotal(type,normal);
            System.out.println("total:"+total);
            System.out.print("还要继续吗？：");
            exit = scanner.nextByte();
            totals += total;
            count ++;
        }
        System.out.println("总计："+totals);
    }

    private static double getTotal(int type,int money){
        double total = 0.0;
        switch (type){
            case 1:
                //正常收费
                total = money;
                break;
            case 2:
                //打 7 折
                total = 0.7 * money;
                break;
            case 3:
                //满减 满200减一百
                total = money > 200 ? money-100:money;
                break;
        }
        return total;
    }
}
