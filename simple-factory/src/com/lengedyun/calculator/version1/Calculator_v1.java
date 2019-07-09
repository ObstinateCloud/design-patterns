package com.lengedyun.calculator.version1;

import java.util.Scanner;

/**
 * @author zjy
 * @title: Calculator_v1
 * @projectName design-patterns
 * @description: 计算器1 beta版  计算用于使用完全耦合
 * @date 2019/6/30 10:59
 */
public class Calculator_v1 {


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
            StringBuilder result = new StringBuilder("计算结果为：");
            switch (operate) {
                case "+":
                    result.append(iNumberA + iNumberB);
                    break;
                case "-":
                    result.append(iNumberA - iNumberB);
                    break;
                case "*":
                    result.append(iNumberA * iNumberB);
                    break;
                case "/":
                    if (iNumberB == 0) {
                        result.append("0不能做除数");
                    } else {
                        result.append(iNumberA / iNumberB);
                    }
                    break;
                default:
                    result.append(operate + "未定义的运算符");
                    break;
            }
            System.out.println(result);
            count ++;
        }

    }
}
