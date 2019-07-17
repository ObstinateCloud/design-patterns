package com.lengedyun.printresume.version2;

import com.lengedyun.printresume.version1.Resume_v1;

/**
 * @title: ResumeClient_v1
 * @description: 简历制作 姓名必填其他选填 使用clone初始化
 * @auther: zjyun
 * @date: 2019/7/16 7:14
 */
public class ResumeClient_v2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("-----------简历制作系统----------");
        Resume_v2 resumeV2_1 = new Resume_v2("zjy");
        resumeV2_1.setPersonInfo("男",23);
        resumeV2_1.setWorkExperience("2017-2019","克东");
        System.out.println(resumeV2_1.toString());
        Resume_v2 resumeV2_2 = (Resume_v2) resumeV2_1.clone();
        resumeV2_2.setPersonInfo("男1",24);
        System.out.println(resumeV2_2.toString());
        Resume_v2 resumeV2_3 = (Resume_v2) resumeV2_1.clone();
        resumeV2_3.setWorkExperience("2017-20193","克东3");
        System.out.println(resumeV2_3.toString());
    }
}
