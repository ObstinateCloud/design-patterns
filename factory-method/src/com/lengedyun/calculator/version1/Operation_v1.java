package com.lengedyun.calculator.version1;

/**
 * @author zjy
 * @title: Operator_v2
 * @projectName design-patterns
 * @description: 通用计算接口
 * @date 2019/6/30 11:27
 */
public abstract class Operation_v1 {

     //定义通用的描述 在接口中无法使用此方式 因为 接口中变量用 static final修饰对象的引用不可变，
     protected StringBuilder result = new StringBuilder("计算结果为：");

     abstract StringBuilder calc(int iNumA, int iNumB);

}
