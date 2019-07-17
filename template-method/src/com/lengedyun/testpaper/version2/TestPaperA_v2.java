package com.lengedyun.testpaper.version2;

/**
 * @title: TestPaperA_v1
 * @description: A学生抄写的试卷
 * @auther: zjyun
 * @date: 2019/7/17 21:36
 */
public class TestPaperA_v2 extends TestPaper{

    public TestPaperA_v2(String name) {
        super(name);
    }

    @Override
    public void question1(){
        super.question1();
        System.out.println("answer1:"+answer1("a"));
    }
    @Override
    public void question2(){
        super.question2();
        System.out.println("answer2:"+answer2("b"));
    }
    @Override
    public void question3(){
        super.question3();
        System.out.println("answer3:"+answer3("c"));
    }

    @Override
    public String answer1(String answer) {
        return answer;
    }

    @Override
    public String answer2(String answer) {
        return answer;
    }

    @Override
    public String answer3(String answer) {
        return answer;
    }
}
