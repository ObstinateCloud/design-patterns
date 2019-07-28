package com.lengedyun.workstate.version2;

/**
 * @author zjy
 * @title: Work_v1
 * @projectName design-patterns
 * @description: 工作状态随时间变化
 * @date 2019/7/28 11:04
 */
public class Work_v2 {

    private int huor;

    private boolean finish;

    private State_v2 stateV2;

    public Work_v2() {
        this.stateV2 = new ForenoonState_v2();
    }

    public State_v2 getStateV2() {
        return stateV2;
    }

    public void setStateV2(State_v2 stateV2) {
        this.stateV2 = stateV2;
    }

    public int getHuor() {
        return huor;
    }

    public void setHuor(int huor) {
        this.huor = huor;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void doWork(){
        stateV2.getWorkState(this);
    }
}
