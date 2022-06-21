package com.lengedyun.abstract_factory_tj.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: AbsTray
 * @description: 标识一组标签，可以包含多个link、image及tray
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:22
 */
public abstract class AbsTray extends AbsItem{

    protected List<AbsItem> items = new ArrayList<>();

    public AbsTray(String caption) {
        super(caption);
    }

    public void addItem(AbsItem absItem){
        items.add(absItem);
    }
}
