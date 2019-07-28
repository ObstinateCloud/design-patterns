package com.lengedyun.workstate.version2;

import com.lengedyun.workstate.version1.Work_v1;

/**
 * @author zjy
 * @title: State_v2
 * @projectName design-patterns
 * @description: 抽象状态类 封装与Context一个特定的状态相关的行为
 * @date 2019/7/28 11:20
 */
public abstract class State_v2 {

    public abstract void getWorkState(Work_v2 workV2);
}
