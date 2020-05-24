package com.lengedyun.manandwoman.version2;

import com.lengedyun.manandwoman.version1.Man_V1;
import com.lengedyun.manandwoman.version1.Woman_V1;

/**
 * @author zjy
 * @title: Action_V2
 * @projectName design-patterns
 * @description: 抽象行为  人的性别比较稳定所以此处可以写两个
 * @date 2019/12/3 7:01
 */
public abstract class Action_V2 {

    public abstract void getManConclusion(Man_V2 concreteElementA);

    public abstract void getWoManConclusion(Woman_V2 concreteElementB);
}
