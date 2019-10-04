package com.lengedyun.command;

/**
 * @author zjy
 * @title: AbstractCommand
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/3 9:57
 */
public abstract class AbstractCommand {

    protected Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();
}
