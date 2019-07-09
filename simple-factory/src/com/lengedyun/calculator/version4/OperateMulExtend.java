package com.lengedyun.calculator.version4;

/**
 * @author zjy
 * @title: OperateMulExtend
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/6/30 11:41
 */
public class OperateMulExtend extends Operation_v4 {
    @Override
    public StringBuilder calc(int iNumA, int iNumB) {


        return result.append(iNumA * iNumB);
    }
}
