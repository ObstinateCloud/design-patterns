package com.lengedyun.composite_tj;

/**
 * @title: Entry
 * @description: 抽象父类
 * @auther: zhangjianyun
 * @date: 2022/6/30 17:29
 */
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public void printList(){
        printList("");
    };
    public abstract void printList(String prefix);

    public void add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toEntryString() {
        return getName()+" ("+getSize()+")";
    }
}
