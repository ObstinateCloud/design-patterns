package com.lengedyun.manandwoman.version2;

import com.lengedyun.manandwoman.version1.Man_V1;
import com.lengedyun.manandwoman.version1.Woman_V1;

/**
 * @author zjy
 * @title: Amativeness_V2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/12/3 7:20
 */
public class Amativeness_V2 extends Action_V2 {

    @Override
    public void getManConclusion(Man_V2 concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()+","+this.getClass().getSimpleName()
                +"时，凡事不懂也要装懂");
    }

    @Override
    public void getWoManConclusion(Woman_V2 concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()+","+this.getClass().getSimpleName()
                +"时，遇事懂也装不懂");
    }
}
