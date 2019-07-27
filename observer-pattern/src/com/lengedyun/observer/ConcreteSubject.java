package com.lengedyun.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: ConcreteSubject
 * @projectName design-patterns
 * @description: 具体主题
 * @date 2019/7/27 12:18
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
