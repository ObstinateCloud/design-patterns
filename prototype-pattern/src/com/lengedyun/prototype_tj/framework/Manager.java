package com.lengedyun.prototype_tj.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String,Product> showCase = new HashMap<>();

    public void register(String name,Product product){
        showCase.put(name,product);
    }

    public Product create(String name){
        return showCase.get(name);
    }
}
