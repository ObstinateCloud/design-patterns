package com.lengedyun.testpaper.version1;

/**
 * @title: TestPaperClient_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/17 21:51
 */
public class TestPaperClient_v1 {

    public static void main(String[] args) {
        System.out.println("----------抄题系统--------");
        TestPaperA_v1 testPaperAV1 = new TestPaperA_v1("学生A:");
        testPaperAV1.question1();
        testPaperAV1.question2();
        testPaperAV1.question3();
        System.out.println("\n");
        TestPaperB_v1  testPaperBV1 = new TestPaperB_v1("学生B");
        testPaperBV1.question1();
        testPaperBV1.question2();
        testPaperBV1.question3();

    }
}
