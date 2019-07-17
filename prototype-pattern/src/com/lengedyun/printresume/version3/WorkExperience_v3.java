package com.lengedyun.printresume.version3;

/**
 * @title: WorkExperience_v3
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/17 20:32
 */
public class WorkExperience_v3 {

    private String timearea;

    private String company;

    public String getTimearea() {
        return timearea;
    }

    public void setTimearea(String timearea) {
        this.timearea = timearea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "WorkExperience_v3{" +
                "timearea='" + timearea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
