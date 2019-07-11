package com.lengedyun.leifeng.version2;

import com.lengedyun.leifeng.version1.LeiFeng_v1;
import com.lengedyun.leifeng.version1.UnderGraduate;

/**
 * @title: SimpleFactory
 * @description: TODO
 * @auther: zjyun
 * @date: 2019/7/12 7:02
 */
public class LeiFengSimpleFactory {

    public static LeiFeng_v1 createLeiFeng(int type,String name){
        LeiFeng_v1 leiFengV1 = null;
        switch (type){
            case 1:
                leiFengV1 = new UnderGraduate(name);
                break;
            case 2:
                leiFengV1 = new Volunteer(name);
                break;
        }
        return leiFengV1;
    }
}
