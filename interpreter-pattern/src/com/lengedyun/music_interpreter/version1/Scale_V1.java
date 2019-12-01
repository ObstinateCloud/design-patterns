package com.lengedyun.music_interpreter.version1;

/**
 * @author zjy
 * @title: Scale_V1
 * @projectName design-patterns
 * @description: 音阶类
 * @date 2019/11/16 16:48
 */
public class Scale_V1 extends AbstractExpression_V1{

    @Override
    public void excute(String key, double value) {
        String scale = "";
        switch ((int) value){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;

        }
        System.out.print(" "+scale);
    }
}
