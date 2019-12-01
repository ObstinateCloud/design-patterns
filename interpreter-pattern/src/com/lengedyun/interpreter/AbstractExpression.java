package com.lengedyun.interpreter;

/**
 * @author zjy
 * @title: AbstractExpression_V1
 * @projectName design-patterns
 * @description: 正则表达式抽象类
 * @date 2019/11/15 7:32
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context context);
}
