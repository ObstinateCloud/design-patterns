package com.lengedyun.strategy_tj;

/**
 * @title: StrategyTest
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/22 16:44
 */
public class StrategyTest {

    public static void main(String[] args) {

        Player player1 = new Player("zhangsan", new WinningStrategy(1));
        Player player2 = new Player("lisi", new ProbStrategy(0));
        for (int i = 0; i < 100; i++) {
            System.out.print("round:"+(i+1));
            Hand hand1 = player1.nextHand();
            System.out.print(" zhangsan:"+hand1.getHandName());
            Hand hand2 = player2.nextHand();
            System.out.print(" lisi:"+hand2.getHandName());
            if (hand1.isStrongerThan(hand2)) {
                System.out.println(" Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (hand1.isWeakThan(hand2)) {
                System.out.println(" Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println(" Even .....");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }

}
