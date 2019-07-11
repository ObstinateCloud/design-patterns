package com.lengedyun.leifeng.version3;

import com.lengedyun.leifeng.version1.LeiFeng_v1;
import com.lengedyun.leifeng.version1.UnderGraduate;

/**
 * @title: UnderGraduateFactory
 * @description: 在校大学生工厂
 * @auther: zjyun
 * @date: 2019/7/12 7:15
 */
public class UnderGraduateFactory implements ILeiFengFactory{

    @Override
    public LeiFeng_v1 createLeiFeng(String name) {
        return new UnderGraduate(name);
    }
}
