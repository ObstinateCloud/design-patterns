package com.lengedyun.calculator.version1;


/**
 * @author zjy
 * @title: OperateDivExtend
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/6/30 11:42
 */
public class OperateDivExtend extends Operation_v1 {

    @Override
    public StringBuilder calc(int iNumA, int iNumB) {
        if(iNumB == 0){
            result.append("除数不能为0");
        }else {
            result.append(iNumA / iNumB);
        }
        return result;
    }
}
