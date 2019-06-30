package com.lengedyun.calculator.version4;

import com.lengedyun.calculator.version3.*;

/**
 * @author zjy
 * @title: OperationFactory_v3
 * @projectName design-patterns
 * @description: 根据操作符产生计算对象
 * @date 2019/6/30 11:53
 */
public class OperationFactory_v4 {

    public static Operation_v4 createOperation(String operateSign){

        Operation_v4 operationV4 = null;
        switch (operateSign) {
            case "+":
                operationV4 = new OperateAddExtend();
                break;
            case "-":
                operationV4 = new OperateSubExtend();
                break;
            case "*":
                operationV4 = new OperateMulExtend();
                break;
            case "/":
                operationV4 = new OperateDivExtend();
                break;
            default:
                break;
        }
        return operationV4;
    }
}
