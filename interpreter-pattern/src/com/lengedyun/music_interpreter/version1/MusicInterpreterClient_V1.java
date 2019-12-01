package com.lengedyun.music_interpreter.version1;

/**
 * @author zjy
 * @title: MusicInterpreterClient_V1
 * @projectName design-patterns
 * @description: 音乐解释器
 * @date 2019/11/18 7:05
 */
public class MusicInterpreterClient_V1 {

    public static void main(String[] args) {

        PlayContext_V1 context_v1 = new PlayContext_V1();
        //音乐上海滩
        System.out.println("上海滩");
        context_v1.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        AbstractExpression_V1 expressionV1 = null;
        while (context_v1.getText().length()>0){
            String str = context_v1.getText().substring(0,1);
            switch (str){
                case "O":
                    expressionV1 = new Scale_V1(); //如果是字母O则实例化为音阶
                    break;
                case "T":
                    expressionV1 = new Speed_V1(); //如果是字母T则实例化为音速
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expressionV1 = new Note_V1();//P为休止符
                    break;
            }
            expressionV1.interpreter(context_v1);
        }
    }
}
