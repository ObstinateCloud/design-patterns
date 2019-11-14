package com.lengedyun.buildwebsite.version2;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zjy
 * @title: WebSiteFactory
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:18
 */
public class WebSiteFactory {

    private ConcurrentHashMap<String,WebSite_V2> websites = new ConcurrentHashMap<>();

    public WebSite_V2 getWebSite(String name){
        if(!websites.containsKey(name)){
            websites.put(name,new ConcreteWebSite(name));
        }
        return websites.get(name);
    }

    public int getWebSiteCount(){
        return websites.size();
    }
}
