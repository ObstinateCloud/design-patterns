package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.Observer_v2;
import com.lengedyun.secretary.version2.Secretary_v2;

/**
 * @title: Observer_v2
 * @description: NBA观察者
 * @auther: zjyun
 * @date: 2019/7/26 7:17
 */
public class NBAObserver_v3 extends Observer_v3{

    private Subject_v3 subjectV3;

    public NBAObserver_v3(String name, Subject_v3 subject_v3) {
       super(name,subject_v3);
       this.subjectV3 = subject_v3;
    }

    @Override
    public void updateAction(){
        System.out.println(subjectV3.getSubjectState()+","+name+"停止看nba，开始工作");
    }
}
