package com.lengedyun.printresume.version3;

/**
 * @title: Resume_v1
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/16 7:06
 */
public class Resume_v3 implements Cloneable{

    private String name;

    private int age;

    private String sex;

    private WorkExperience_v3 workExperience_v3;


    public Resume_v3(String name) {
        this.name = name;
        workExperience_v3 = new WorkExperience_v3();
    }


    public void setPersonInfo(String sex,int name){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timearea,String company){
        workExperience_v3.setTimearea(timearea);
        workExperience_v3.setCompany(company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Resume_v3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", workExperience_v3=" + workExperience_v3.toString() +
                '}';
    }

    public WorkExperience_v3 getWorkExperience_v3() {
        return workExperience_v3;
    }

    public void setWorkExperience_v3(WorkExperience_v3 workExperience_v3) {
        this.workExperience_v3 = workExperience_v3;
    }
}
