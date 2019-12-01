package com.lengedyun.interpreter;

/**
 * @author zjy
 * @title: NotTerminalExpression
 * @projectName design-patterns
 * @description: 非终结符表达式
 * @date 2019/11/15 7:35
 */
public class NotTerminalExpression extends AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
