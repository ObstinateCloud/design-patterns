package com.lengedyun.composite_tj;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @title: Directory
 * @description: TODO
 * @auther: zhangjianyun
 * @date: 2022/6/30 17:30
 */
public class Directory extends Entry {

    private String name;

    private ArrayList<Entry> directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = (Entry) iterator.next();
            size += next.getSize();
        }

        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this.toEntryString());
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = (Entry) iterator.next();
            next.printList(prefix+"/"+name);
        }
    }

    @Override
    public void add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
    }
}
