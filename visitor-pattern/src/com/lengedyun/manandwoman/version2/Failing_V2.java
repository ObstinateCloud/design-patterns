package com.lengedyun.manandwoman.version2;

import com.lengedyun.manandwoman.version1.Man_V1;
import com.lengedyun.manandwoman.version1.Woman_V1;
import com.lengedyun.manandwoman.version2.Action_V2;

/**
 * @author zjy
 * @title: Failing_V2
 * @projectName design-patterns
 * @description: 失败
 * @date 2019/12/3 7:16
 */
public class Failing_V2 extends Action_V2 {

    @Override
    public void getManConclusion(Man_V2 concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+this.getClass().getSimpleName()
                +"时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWoManConclusion(Woman_V2 concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+this.getClass().getSimpleName()
                +"时，眼泪汪汪，谁也劝不了");
    }
}
