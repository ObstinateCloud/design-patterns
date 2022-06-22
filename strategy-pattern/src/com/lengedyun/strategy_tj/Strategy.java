package com.lengedyun.strategy_tj;

/**
 * @title: Strategy
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/22 10:55
 */
public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}
