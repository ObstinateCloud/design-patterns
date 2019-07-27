package com.lengedyun.secretary.version3;

import com.lengedyun.secretary.version2.Observer_v2;

/**
 * 通知者接口
 */
public interface Subject_v3 {

    //增加
    void attach(Observer_v3 observerV3);
    //减少
    void detach(Observer_v3 observerV3);
    //通知
    void notifyAllColleague();

    String getSubjectState();
}
