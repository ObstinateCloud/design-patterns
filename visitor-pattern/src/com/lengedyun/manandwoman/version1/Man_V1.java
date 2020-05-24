package com.lengedyun.manandwoman.version1;

/**
 * @author zjy
 * @title: Man_V1
 * @projectName design-patterns
 * @description: 男人
 * @date 2019/12/2 7:12
 */
public class Man_V1 extends Person_V1{

    @Override
    public void getConclusion() {

        if (action == "成功"){
            System.out.println(this.getClass().getSimpleName()+action+"时，背后多半有个伟大的女人");
        }else if(action == "失败"){
            System.out.println(this.getClass().getSimpleName()+action+"时，闷头喝酒，谁也不用劝");
        }else if(action == "恋爱"){
            System.out.println(this.getClass().getSimpleName()+action+"时，凡事不懂也要装懂");
        }
    }
}
