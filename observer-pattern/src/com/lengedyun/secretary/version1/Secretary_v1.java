package com.lengedyun.secretary.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: Secretary_v1
 * @description: 前台秘书类
 * @auther: zjyun
 * @date: 2019/7/25 7:16
 */
public class Secretary_v1 {
    private List<Colleague_v1> colleagueV1s = new ArrayList<>();

    private String action;

    //把需要通知的同事记下来
    public void attach(Colleague_v1 colleagueV1){
        colleagueV1s.add(colleagueV1);
    }

    public void notifyAllColleague(){
        for (Colleague_v1 colleagueV1 : colleagueV1s) {
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
