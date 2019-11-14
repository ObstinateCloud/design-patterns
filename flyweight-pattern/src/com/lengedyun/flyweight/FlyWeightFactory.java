package com.lengedyun.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zjy
 * @title: FlyWeightFactory
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:08
 */
public class FlyWeightFactory {

    private ConcurrentHashMap<String,FlyWeight> flyWeights = new ConcurrentHashMap<>();

    public FlyWeightFactory() {

        flyWeights.put("x",new ConcreteFlyWeight());
        flyWeights.put("y",new ConcreteFlyWeight());
        flyWeights.put("z",new ConcreteFlyWeight());
    }

    public FlyWeight getFlyWeight(String key){

        return flyWeights.get(key);
    }
}
