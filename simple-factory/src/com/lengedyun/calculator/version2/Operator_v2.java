package com.lengedyun.calculator.version2;

/**
 * @author zjy
 * @title: Operator_v2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/6/30 11:27
 */
public class Operator_v2 {

    public static StringBuilder getResult(int iNumberA,int iNumberB,String operate){
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
        return result;
    }
}
