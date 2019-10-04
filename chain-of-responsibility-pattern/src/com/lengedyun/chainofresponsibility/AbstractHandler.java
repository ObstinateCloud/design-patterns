package com.lengedyun.chainofresponsibility;

/**
 * @author zjy
 * @title: AbstractHandler
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/4 11:51
 */
public abstract class AbstractHandler {

    protected AbstractHandler abstractHandler;

    public void setAbstractHandler(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public abstract void handlerReq(int req);
}
