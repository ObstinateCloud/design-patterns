package com.lengedyun.chainofresponsibility;

/**
 * @author zjy
 * @title: ConcreteHandler1
 * @projectName design-patterns
 * @description: 具体处理者1
 * @date 2019/10/4 11:53
 */
public class ConcreteHandler1 extends AbstractHandler {

    @Override
    public void handlerReq(int req) {
        if (req > 0 && req <= 10) {
            System.out.println("req=" + req + ":" + this.getClass().getSimpleName() + "处理了此请求");
        } else {
            abstractHandler.handlerReq(req);
        }
    }
}
