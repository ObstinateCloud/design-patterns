package com.lengedyun.music_interpreter.version1;

/**
 * @author zjy
 * @title: Note_V1
 * @projectName design-patterns
 * @description: 音符类
 * @date 2019/11/16 16:48
 */
public class Note_V1 extends AbstractExpression_V1{

    @Override
    public void excute(String key, double value) {
        String note = "";
        switch (key){
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(" "+note);
    }
}
