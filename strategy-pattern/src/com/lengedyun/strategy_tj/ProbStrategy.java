package com.lengedyun.strategy_tj;

import java.util.Arrays;
import java.util.Random;

/**
 * @title: ProbStrategy
 * @description: 出拳策略2 赢了就换拳
 * @auther: zhangjianyun
 * @date: 2022/6/22 10:57
 */
public class ProbStrategy implements Strategy {

    private Random random;

    private int prevHandValue;

    private int currentHandValue;

    private static int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };


    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue ;
        if (bet < history[currentHandValue][0]){
            handValue = 0;
        }else if(bet <history[currentHandValue][0]+history[currentHandValue][1]){
            handValue = 1;
        }else {
            handValue =2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHandValue][currentHandValue]++;
        }else {
            history[prevHandValue][(currentHandValue+1)%3]++;
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }
}
