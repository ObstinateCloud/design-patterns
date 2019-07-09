package com.lengedyun.calculator.version4;

import com.lengedyun.calculator.version3.OperationFactory_v3;
import com.lengedyun.calculator.version3.Operation_v3;

import java.util.Scanner;

/**
 * @author zjy
 * @title: CalculiatorClient_v2
 * @projectName design-patterns
 * @description: 简单工厂采用继承父类 实现
 * @date 2019/6/30 11:26
 */
public class CalculiatorClient_v4 {

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
            Operation_v4 operationV4 = OperationFactory_v4.createOperation(operate);
            System.out.println(operationV4.calc(iNumberA,iNumberB));
            count ++;
        }
    }
}
