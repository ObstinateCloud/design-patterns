package com.lengedyun.strategy_tj;

import java.util.Random;

/**
 * @title: WinningStrategy
 * @description: 出拳策略1 赢了继续出上把的拳 没有赢随机出拳
 * @auther: zhangjianyun
 * @date: 2022/6/22 10:56
 */
public class WinningStrategy implements Strategy {

    private Random random;

    private Boolean won = false ;

    private Hand prevHand;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
