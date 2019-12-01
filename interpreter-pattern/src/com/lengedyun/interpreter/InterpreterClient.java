package com.lengedyun.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: InterpreterClient
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/16 16:25
 */
public class InterpreterClient {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NotTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NotTerminalExpression());

        expressions.forEach(p->{
            p.interpret(context);
        });
    }
}
