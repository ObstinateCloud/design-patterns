package com.lengedyun.testpaper.version2;

/**
 * @title: TestPaperV_v1
 * @description: B学生抄写的试卷
 * @auther: zjyun
 * @date: 2019/7/17 21:36
 */
public class TestPaperB_v2 extends TestPaper{


    public TestPaperB_v2(String name) {
        super(name);
    }

    @Override
    public void question1(){
        super.question1();
        System.out.println("answer1:"+answer1("c"));
    }
    @Override
    public void question2(){
        super.question2();
        System.out.println("answer2:"+answer2("b"));
    }
    @Override
    public void question3(){
        super.question3();
        System.out.println("answer3:"+answer3("a"));
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
