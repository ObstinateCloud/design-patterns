package com.lengedyun.music_interpreter.version1;

/**
 * @author zjy
 * @title: AbstractExpression_V1
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/16 16:35
 */
public abstract class AbstractExpression_V1 {

    public void interpreter(PlayContext_V1 context_v1){
        if(context_v1.getText().length()==0){
            return;
        }else {
            String playKey = context_v1.getText().substring(0,1);
            context_v1.setText(context_v1.getText().substring(2));
            double playValue = Double.parseDouble(context_v1.getText().substring(0,context_v1.getText().indexOf(" ")));
            context_v1.setText(context_v1.getText().substring(context_v1.getText().indexOf(" ")+1));
            excute(playKey,playValue);
        }
    }

    public abstract void excute(String key,double value);

}
