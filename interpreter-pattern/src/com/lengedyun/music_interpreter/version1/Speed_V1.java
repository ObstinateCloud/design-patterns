package com.lengedyun.music_interpreter.version1;

/**
 * @author zjy
 * @title: Speed_V1
 * @projectName design-patterns
 * @description: 音速类
 * @date 2019/11/18 7:47
 */
public class Speed_V1 extends AbstractExpression_V1{

    @Override
    public void excute(String key, double value) {
        String speed;
        if(value<500){
            speed = "快速";
        }else if(value>=1000){
            speed = "慢速";
        }else{
            speed = "中速";
        }
        System.out.println(" "+speed+" ");
    }
}
