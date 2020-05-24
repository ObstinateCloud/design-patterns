package com.lengedyun.manandwoman.version2;

import com.lengedyun.manandwoman.version1.Man_V1;
import com.lengedyun.manandwoman.version1.Woman_V1;

/**
 * @author zjy
 * @title: Success_V2
 * @projectName design-patterns
 * @description: 具体行为
 * @date 2019/12/3 7:06
 */
public class Success_V2 extends Action_V2{

    @Override
    public void getManConclusion(Man_V2 concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后多半有个伟大的女人");
    }

    @Override
    public void getWoManConclusion(Woman_V2 concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+this.getClass().getSimpleName()+"时，背后多半有个不成功的男人");
    }
}
