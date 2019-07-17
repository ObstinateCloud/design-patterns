package com.lengedyun.testpaper.version1;

/**
 * @title: TestPaperB_v1
 * @description: B学生抄写的试卷
 * @auther: zjyun
 * @date: 2019/7/17 21:36
 */
public class TestPaperB_v1 {

    private String name;

    public TestPaperB_v1(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void question1(){
        System.out.print("question1:");
        System.out.println("answer1:c");
    }

    public void question2(){
        System.out.print("question2:");
        System.out.println("answer2:b");
    }

    public void question3(){
        System.out.print("question3:");
        System.out.println("answer3:"+"a");
    }
}
