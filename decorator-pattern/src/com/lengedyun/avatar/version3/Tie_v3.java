package com.lengedyun.avatar.version3;

import com.lengedyun.avatar.version2.Finery;

/**
 * @author zjy
 * @title: TSh
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/7 10:59
 */
public class Tie_v3 extends PersonDecorator {

    @Override
    public void show() {
        System.out.println("打领带");
        super.show();
    }
}
