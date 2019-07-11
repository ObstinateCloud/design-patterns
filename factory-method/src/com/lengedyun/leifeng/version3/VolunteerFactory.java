package com.lengedyun.leifeng.version3;

import com.lengedyun.leifeng.version1.LeiFeng_v1;
import com.lengedyun.leifeng.version2.Volunteer;

/**
 * @title: VolunteerFactory
 * @description: 志愿者工厂
 * @auther: zjyun
 * @date: 2019/7/12 7:17
 */
public class VolunteerFactory implements ILeiFengFactory {
    @Override
    public LeiFeng_v1 createLeiFeng(String name) {
        return new Volunteer(name);
    }
}
