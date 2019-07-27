package com.lengedyun.secretary.version2;


import java.util.ArrayList;
import java.util.List;

/**
 * @title: Secretary_v1
 * @description: 前台秘书类
 * @auther: zjyun
 * @date: 2019/7/25 7:16
 */
public class Secretary_v2 {
    private List<Observer_v2> colleagueV1s = new ArrayList<>();

    private String action;

    //把需要通知的同事记下来
    public void attach(Observer_v2 observerV2){
        colleagueV1s.add(observerV2);
    }

    //减少
    public void detach(Observer_v2 observerV2){
        colleagueV1s.remove(observerV2);
    }

    public void notifyAllColleague(){
        for (Observer_v2 colleagueV1 : colleagueV1s) {
            colleagueV1.updateAction();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
