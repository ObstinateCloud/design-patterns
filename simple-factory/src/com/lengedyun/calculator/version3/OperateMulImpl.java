package com.lengedyun.calculator.version3;

/**
 * @author zjy
 * @title: OperateMulExtend
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/6/30 11:41
 */
public class OperateMulImpl implements Operation_v3 {
    @Override
    public StringBuilder calc(int iNumA, int iNumB) {

        StringBuilder result = new StringBuilder("计算结果为：");

        return result.append(iNumA * iNumB);
    }
}
