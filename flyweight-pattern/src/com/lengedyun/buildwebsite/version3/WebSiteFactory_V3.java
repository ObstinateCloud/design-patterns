package com.lengedyun.buildwebsite.version3;

import com.lengedyun.buildwebsite.version2.ConcreteWebSite;
import com.lengedyun.buildwebsite.version2.WebSite_V2;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zjy
 * @title: WebSiteFactory
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/11/12 7:18
 */
public class WebSiteFactory_V3 {

    private ConcurrentHashMap<String,WebSite_V3> websites = new ConcurrentHashMap<>();

    public WebSite_V3 getWebSite(String name){
        if(!websites.containsKey(name)){
            websites.put(name,new ConcreteWebSite_V3(name));
        }
        return websites.get(name);
    }

    public int getWebSiteCount(){
        return websites.size();
    }
}
