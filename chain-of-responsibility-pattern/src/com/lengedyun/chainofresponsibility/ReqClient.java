package com.lengedyun.chainofresponsibility;

/**
 * @author zjy
 * @title: ReqClient
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/4 12:03
 */
public class ReqClient {

    public static void main(String[] args) {
        System.out.println("--------------职责链客户端--------");
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        AbstractHandler handler3 = new ConcreteHandler3();
        handler1.setAbstractHandler(handler2);
        handler2.setAbstractHandler(handler3);

        int[] reqs = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int req : reqs) {
            handler1.handlerReq(req);
        }
    }
}
