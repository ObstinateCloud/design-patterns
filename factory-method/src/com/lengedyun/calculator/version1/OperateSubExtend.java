package com.lengedyun.calculator.version1;


/**
 * @author zjy
 * @title: OperateSubExtend
 * @projectName design-patterns
 * @description: 减法
 * @date 2019/6/30 11:40
 */
public class OperateSubExtend extends Operation_v1 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {


        return result.append(iNumA - iNumB);
    }
}
