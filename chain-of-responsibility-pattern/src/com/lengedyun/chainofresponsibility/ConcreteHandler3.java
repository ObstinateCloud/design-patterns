package com.lengedyun.chainofresponsibility;

/**
 * @author zjy
 * @title: ConcreteHandler3
 * @projectName design-patterns
 * @description: 具体处理者3
 * @date 2019/10/4 11:53
 */
public class ConcreteHandler3 extends AbstractHandler {

    @Override
    public void handlerReq(int req) {
        if (req > 20 && req <= 30) {
            System.out.println("req=" + req + ":" + this.getClass().getSimpleName() + "处理了此请求");
        } else {
            abstractHandler.handlerReq(req);
        }
    }
}
