package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: Translator_v1
 * @projectName design-patterns
 * @description: 翻译
 * @date 2019/7/28 16:04
 */
public class Translator_v1 extends Player_v1{

    public Translator_v1(String name) {
        super(name);
        foreignCenterV1.setName(name);
    }

    private ForeignCenter_v1 foreignCenterV1 = new ForeignCenter_v1();

    @Override
    public void attack() {
        foreignCenterV1.attackChinese();
    }

    @Override
    public void defense() {
       foreignCenterV1.defenseChinese();
    }
}
