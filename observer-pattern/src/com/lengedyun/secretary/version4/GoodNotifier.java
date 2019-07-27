package com.lengedyun.secretary.version4;

/**
 * @author zjy
 * @title: GoodNotifier
 * @projectName design-patterns
 * @description: 具体的通知者
 * @date 2019/7/27 15:02
 */
public class GoodNotifier extends Notifier{

    @Override
    public void addListener(Object object,String methodName,Object...args) {
        System.out.println("有新的同学需要放哨业务");
        this.getEventHandler().addEvent(object,methodName,args);

    }

    @Override
    public void notifyX() {
        System.out.println("老师来了");
        try {
            this.getEventHandler().notifyALL();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
