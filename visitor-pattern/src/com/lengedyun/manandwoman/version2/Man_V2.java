package com.lengedyun.manandwoman.version2;

/**
 * @author zjy
 * @title: Man_V2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/12/3 7:21
 */
public class Man_V2 extends Person_V2 {

    @Override
    public void accept(Action_V2 visitor) {
        visitor.getManConclusion(this);
    }
}
