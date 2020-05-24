package com.lengedyun.manandwoman.version1;

/**
 * @author zjy
 * @title: Woman_V1
 * @projectName design-patterns
 * @description: 女人
 * @date 2019/12/2 7:13
 */
public class Woman_V1 extends Person_V1 {

    @Override
    public void getConclusion() {
        if (action == "成功") {
            System.out.println(this.getClass().getSimpleName() + action + "时，背后多半有个不成功的男人");
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + action + "时，眼泪汪汪，谁也劝不了");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + action + "时，遇事懂也装不懂");
        }
    }
}
