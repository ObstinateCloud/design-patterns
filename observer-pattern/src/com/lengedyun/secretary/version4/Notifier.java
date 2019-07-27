package com.lengedyun.secretary.version4;

/**
 * @author zjy
 * @title: Notifier
 * @projectName design-patterns
 * @description: 抽象通知者
 * @date 2019/7/27 14:57
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    //增加 需要放哨的学生
    public abstract void addListener(Object object,String methodName,Object...args);

    //通知方法
    public abstract void notifyX();
}
