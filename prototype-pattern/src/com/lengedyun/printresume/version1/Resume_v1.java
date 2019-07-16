package com.lengedyun.printresume.version1;

/**
 * @title: Resume_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/16 7:06
 */
public class Resume_v1 {

    private String name;

    private int age;

    private String sex;

    private String timearea;

    private String company;

    public Resume_v1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resume_v1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", timearea='" + timearea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void setPersonInfo(String sex,int name){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timearea,String company){
        this.timearea = timearea;
        this.company = company;
    }
}
