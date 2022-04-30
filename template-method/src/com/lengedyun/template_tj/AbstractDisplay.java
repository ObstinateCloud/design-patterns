package com.lengedyun.template_tj;

/**
 * 将方法的执行顺序定义在父类中
 * @author zjy
 * @date 2022年4月30日
 * @descraption
 */
public abstract class AbstractDisplay {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    protected void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
