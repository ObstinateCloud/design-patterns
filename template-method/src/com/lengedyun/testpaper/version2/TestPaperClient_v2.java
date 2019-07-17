package com.lengedyun.testpaper.version2;

import com.lengedyun.testpaper.version1.TestPaperA_v1;
import com.lengedyun.testpaper.version1.TestPaperB_v1;

/**
 * @title: TestPaperClient_v1
 * @description: 两个学生试卷都一样 只是答案不一样  模版方法模式将相同地方放到父类，不同的地方放到子类
 * @auther: zjyun
 * @date: 2019/7/17 21:51
 */
public class TestPaperClient_v2 {

    public static void main(String[] args) {
        System.out.println("----------抄题系统--------");
        TestPaper testPaperAV2 = new TestPaperA_v2("学生A:");
        testPaperAV2.question1();
        testPaperAV2.question2();
        testPaperAV2.question3();
        TestPaper  testPaperBV2 = new TestPaperB_v2("学生B:");
        testPaperBV2.question1();
        testPaperBV2.question2();
        testPaperBV2.question3();

    }
}
