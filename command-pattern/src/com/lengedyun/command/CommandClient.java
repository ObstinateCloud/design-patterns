package com.lengedyun.command;

/**
 * @author zjy
 * @title: CommandClient
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/3 10:07
 */
public class CommandClient {

    public static void main(String[] args) {
        System.out.println("-------命令模式------");
        Receiver receiver = new Receiver();
        AbstractCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.excuteCommand();

    }
}
