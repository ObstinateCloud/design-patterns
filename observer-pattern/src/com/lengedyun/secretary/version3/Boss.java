package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.Observer_v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: Boss
 * @projectName design-patterns
 * @description: 通知者 老板
 * @date 2019/7/27 10:06
 */
public class Boss implements Subject_v3{

    private List<Observer_v3> observer_v3s = new ArrayList<>();

    private String action;

    @Override
    public void attach(Observer_v3 observerV3) {
        observer_v3s.add(observerV3);
    }

    @Override
    public void detach(Observer_v3 observerV3) {
        observer_v3s.remove(observerV3);
    }

    @Override
    public void notifyAllColleague() {
        for (Observer_v3 observer_v3 : observer_v3s) {
            observer_v3.updateAction();
        }
    }

    @Override
    public String getSubjectState() {
        return getAction();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
