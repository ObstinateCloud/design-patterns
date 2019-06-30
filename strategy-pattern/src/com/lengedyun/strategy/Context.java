package com.lengedyun.strategy;

/**
 * @author zjy
 * @title: Context
 * @projectName design-patterns
 * @description: 上下文对象
 * @date 2019/6/30 17:13
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void CotextInterface(){  //通过上下文去调用具体策略对象的方法
        strategy.AlgoreithmInterface();
    }
}
