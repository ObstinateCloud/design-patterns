package com.lengedyun.command;

/**
 * @author zjy
 * @title: ConcreteCommand
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/3 10:02
 */
public class ConcreteCommand extends AbstractCommand{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.action();
    }
}
