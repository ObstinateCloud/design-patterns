package com.lengedyun.calculator.version1;


/**
 * @author zjy
 * @title: OperateAddExtend
 * @projectName design-patterns
 * @description: 各个方法分离防止被误修改
 * @date 2019/6/30 11:39
 */
public class OperateAddExtend extends Operation_v1 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {


        return result.append(iNumA + iNumB);
    }
}
