package com.lengedyun.calculator.version3;

/**
 * @author zjy
 * @title: OperateDivExtend
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/6/30 11:42
 */
public class OperateDivImpl implements Operation_v3 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {

        StringBuilder result = new StringBuilder("计算结果为：");

        if(iNumB == 0){
            result.append("除数不能为0");
        }else {
            result.append(iNumA / iNumB);
        }
        return result;
    }
}
