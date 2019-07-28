package com.lengedyun.workstate.version1;

/**
 * @author zjy
 * @title: Work_v1
 * @projectName design-patterns
 * @description: 工作状态随时间变化
 * @date 2019/7/28 11:04
 */
public class Work_v1 {

    private int huor;

    private boolean finish;

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

    public void doWork(int huor) {
        if (huor < 12) {
            System.out.println("当前时间" + huor + ",上午工作精神百倍");
        } else if (huor < 13) {
            System.out.println("当前时间" + huor + ",到饭点了，饿了有点儿困");
        } else if (huor < 17) {
            System.out.println("当前时间" + huor + ",午休过后又好了");
        } else {
            if (finish) {
                System.out.println("当前时间" + huor + ",工作完成下班");
            }else{
                if(huor<21){
                    System.out.println("当前时间"+huor+",加班中心情不爽");
                }else{
                    System.out.println("当前时间"+huor+",往死里加");
                }
            }
        }
    }
}
