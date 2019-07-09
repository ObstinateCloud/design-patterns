package com.lengedyun.calculator.version3;

/**
 * @author zjy
 * @title: OperateSubExtend
 * @projectName design-patterns
 * @description: 减法
 * @date 2019/6/30 11:40
 */
public class OperateSubImpl implements Operation_v3 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {

        StringBuilder result = new StringBuilder("计算结果为：");

        return result.append(iNumA - iNumB);
    }
}
