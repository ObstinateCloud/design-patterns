package com.lengedyun.printresume.version3;

import com.lengedyun.printresume.version2.Resume_v2;

/**
 * @title: ResumeClient_v1
 * @description: 简历制作 姓名必填其他选填 使用clone初始化
 * @auther: zjyun
 * @date: 2019/7/16 7:14
 */
public class ResumeClient_v3 {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("-----------简历制作系统----------");
        Resume_v3 resumeV3_1 = new Resume_v3("zjy");
        resumeV3_1.setPersonInfo("男",23);
        resumeV3_1.setWorkExperience("2017-2018","尚艺");
        System.out.println(resumeV3_1.toString());
        Resume_v3 resumeV3_2 = (Resume_v3) resumeV3_1.clone();
        resumeV3_2.setWorkExperience("2018-2019","国网");
        System.out.println(resumeV3_2.toString());
        Resume_v3 resumeV3_3 = (Resume_v3) resumeV3_1.clone();
        WorkExperience_v3 workExperience_v3 = new WorkExperience_v3();
        workExperience_v3.setTimearea("2019-1020");
        workExperience_v3.setCompany("新公司");
        resumeV3_3.setWorkExperience_v3(workExperience_v3);
        System.out.println(resumeV3_3.toString());
    }
}
