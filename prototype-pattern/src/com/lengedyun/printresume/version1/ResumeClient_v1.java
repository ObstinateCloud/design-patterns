package com.lengedyun.printresume.version1;

/**
 * @title: ResumeClient_v1
 * @description: 简历制作 姓名必填其他选填 打印三份不同的简历需要初始化三次
 * @auther: zjyun
 * @date: 2019/7/16 7:14
 */
public class ResumeClient_v1 {

    public static void main(String[] args) {
        System.out.println("-----------简历制作系统----------");
        Resume_v1 resumeV1_1 = new Resume_v1("zjy");
        resumeV1_1.setPersonInfo("男",23);
        resumeV1_1.setWorkExperience("2017-2019","克东");
        System.out.println(resumeV1_1.toString());
        Resume_v1 resumeV1_2 = new Resume_v1("zjy1");
        resumeV1_2.setPersonInfo("男1",24);
        resumeV1_2.setWorkExperience("2017-20192","克东1");
        System.out.println(resumeV1_2.toString());
        Resume_v1 resumeV1_3 = new Resume_v1("zjy3");
        resumeV1_3.setPersonInfo("男3",23);
        resumeV1_3.setWorkExperience("2017-20193","克东3");
        System.out.println(resumeV1_3.toString());
    }
}
