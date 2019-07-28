package com.lengedyun.statepattern;

/**
 * @author zjy
 * @title: Work
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/28 15:45
 */
public class Work {

    private State currentState;

    public Work(State currentState) {
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        System.out.println(currentState.getClass().getSimpleName());
    }

    public void doWork(){
        currentState.handel(this);
    }
}
