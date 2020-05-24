package com.lengedyun.manandwoman.version2;

/**
 * @author zjy
 * @title: Woman_V2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/12/3 7:23
 */
public class Woman_V2 extends Person_V2 {
    @Override
    public void accept(Action_V2 visitor) {
        visitor.getWoManConclusion(this);
    }
}
