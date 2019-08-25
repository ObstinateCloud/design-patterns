package com.lengedyun.handset.version3;

/**
 * @author zjy
 * @title: HandsetBrand_V2
 * @projectName design-patterns
 * @description: 手机品牌抽象类
 * @date 2019/8/25 14:12
 */
public abstract class HandsetBrand_V3 {

    protected HandsetApp_V3 handsetAppV3;

    public void setHandsetAppV3(HandsetApp_V3 handsetAppV3) {
        this.handsetAppV3 = handsetAppV3;
    }

    public abstract void run();
}
