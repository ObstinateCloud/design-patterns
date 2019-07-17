package com.lengedyun.testpaper.version2;

/**
 * @title: TestPaperA_v1
 * @description: 基类
 * @auther: zjyun
 * @date: 2019/7/17 21:36
 */
public abstract class TestPaper {

    private String name;

    public TestPaper(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void question1() {
        System.out.print("question1:");
    }

    public void question2() {
        System.out.print("question2:");
    }

    public void question3() {
        System.out.print("question3:");
    }

    public abstract String answer1(String answer);

    public abstract String answer2(String answer);

    public abstract String answer3(String answer);
}
