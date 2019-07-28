package com.lengedyun.translator.version1;

/**
 * @author zjy
 * @title: TranslatorClient_v1
 * @projectName design-patterns
 * @description: NBA赛场 教练通过翻译向各国运动员发布战术
 * @date 2019/7/28 16:08
 */
public class TranslatorClient_v1 {

    public static void main(String[] args) {
        System.out.println("-----------------NBA赛场翻译系统----------------");
        Player_v1 playerV11= new Forwards_v1("巴蒂尔");
        playerV11.attack();
        Player_v1 playerV12 = new Guards_v1("麦克格雷迪");
        playerV12.attack();
        //姚明不懂英语
//        Player_v1 playerV13 = new Center_v1("姚明");
        //需要翻译
        Player_v1 playerV13 = new Translator_v1("姚明");
        playerV13.defense();
        playerV13.attack();
    }
}
