package com.lengedyun.command;

/**
 * @author zjy
 * @title: Invoker
 * @projectName design-patterns
 * @description: 执行者 发布命令
 * @date 2019/10/3 10:04
 */
public class Invoker {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.excuteCommand();
    }
}
