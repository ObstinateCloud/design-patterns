package com.lengedyun.strategy_tj;

/**
 * @title: Hand
 * @description: 出拳手势，石头、剪刀、布
 * @auther: zhangjianyun
 * @date: 2022/6/22 10:54
 */
public class Hand {

    public static final int HANDVALUE_GUU = 0; //石头
    public static final int HANDVALUE_CHO = 1; //剪刀
    public static final int HANDVALUE_PAA = 2; //布

    public static final Hand[] hands = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    private static final String[] handName = {
            "石头", "剪刀", "布"
    };

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this.handValue == hand.handValue) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String getHandName(){
        return handName[handValue];
    }
}
