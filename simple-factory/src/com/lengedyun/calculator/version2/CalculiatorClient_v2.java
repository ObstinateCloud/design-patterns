package com.lengedyun.calculator.version2;

import java.util.Scanner;

/**
 * @author zjy
 * @title: CalculiatorClient_v2
 * @projectName design-patterns
 * @description: TODO 客户端与计算分离
 * @date 2019/6/30 11:26
 */
public class CalculiatorClient_v2 {

    public static void main(String[] args) {
        int count = 1;
        while (true){
            System.out.println("第 "+count+" 次");
            System.out.println("请输入数字A：");
            Scanner scanner = new Scanner(System.in);
            int iNumberA = scanner.nextInt();
            System.out.println("请输入运算符('+','-','*','/')");
            String operate = scanner.next();
            System.out.println("请输入数字B");
            int iNumberB = scanner.nextInt();
            System.out.println(Operator_v2.getResult(iNumberA,iNumberB,operate));
            count ++;
        }
    }
}
