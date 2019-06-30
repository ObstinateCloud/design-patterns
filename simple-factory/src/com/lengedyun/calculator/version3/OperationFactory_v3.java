package com.lengedyun.calculator.version3;

/**
 * @author zjy
 * @title: OperationFactory_v3
 * @projectName design-patterns
 * @description: 根据操作符产生计算对象
 * @date 2019/6/30 11:53
 */
public class OperationFactory_v3 {

    public static Operation_v3 createOperation(String operateSign){

        Operation_v3 operationV3 = null;
        switch (operateSign) {
            case "+":
                operationV3 = new OperateAddImpl();
                break;
            case "-":
                operationV3 = new OperateSubImpl();
                break;
            case "*":
                operationV3 = new OperateMulImpl();
                break;
            case "/":
                operationV3 = new OperateDivImpl();
                break;
            default:
                break;
        }
        return operationV3;
    }
}
