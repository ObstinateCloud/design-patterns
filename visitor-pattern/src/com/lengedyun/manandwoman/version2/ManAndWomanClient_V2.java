package com.lengedyun.manandwoman.version2;

/**
 * @author zjy
 * @title: ManAndWomanClient_V2
 * @projectName design-patterns
 * @description: 访问者模式
 * @date 2019/12/3 7:33
 */
public class ManAndWomanClient_V2 {

    public static void main(String[] args) {
        ObjectStructure_V2 objectStructure_v2 = new ObjectStructure_V2();
        objectStructure_v2.attach(new Woman_V2());
        objectStructure_v2.attach(new Man_V2());

        Success_V2 success_v2 = new Success_V2();
        objectStructure_v2.display(success_v2);

        Failing_V2 failing_v2 = new Failing_V2();
        objectStructure_v2.display(failing_v2);

        Amativeness_V2 amativeness_v2 = new Amativeness_V2();
        objectStructure_v2.display(amativeness_v2);

        //扩展婚姻状态
        Marriage_V2 marriage_v2 = new Marriage_V2();
        objectStructure_v2.display(marriage_v2);
    }
}
