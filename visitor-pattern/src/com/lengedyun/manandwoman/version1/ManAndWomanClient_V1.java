package com.lengedyun.manandwoman.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: ManAndWomanClient_V1
 * @projectName design-patterns
 * @description: 男人和女人的区别
 * @date 2019/12/2 7:22
 */
public class ManAndWomanClient_V1 {


    public static void main(String[] args) {
        List<Person_V1> personV1s = new ArrayList<>();
        Person_V1 man1 = new Man_V1();
        man1.action = "成功";
        personV1s.add(man1);
        Woman_V1 woman1 = new Woman_V1();
        woman1.action = "成功";
        personV1s.add(woman1);

        Person_V1 man2 = new Man_V1();
        man2.action = "失败";
        personV1s.add(man2);
        Woman_V1 woman2 = new Woman_V1();
        woman2.action = "失败";
        personV1s.add(woman2);

        Person_V1 man3 = new Man_V1();
        man3.action = "恋爱";
        personV1s.add(man3);
        Woman_V1 woman3 = new Woman_V1();
        woman3.action = "恋爱";
        personV1s.add(woman3);

        personV1s.forEach(p->{
            p.getConclusion();
        });
    }
}
