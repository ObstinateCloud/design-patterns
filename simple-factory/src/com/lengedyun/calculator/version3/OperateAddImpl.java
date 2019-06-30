package com.lengedyun.calculator.version3;

/**
 * @author zjy
 * @title: OperateAddExtend
 * @projectName design-patterns
 * @description: 各个方法分离防止被误修改
 * @date 2019/6/30 11:39
 */
public class OperateAddImpl implements Operation_v3 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {

        StringBuilder result = new StringBuilder("计算结果为：");

        return result.append(iNumA + iNumB);
    }
}
