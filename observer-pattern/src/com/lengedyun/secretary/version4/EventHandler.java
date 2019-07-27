package com.lengedyun.secretary.version4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: EventHandler
 * @projectName design-patterns
 * @description: 事件处理者
 * @date 2019/7/27 13:58
 */
public class EventHandler {

    private List<Event> events;

    public EventHandler(){
        events = new ArrayList<>();
    }

    public void addEvent(Object object,String methodName,Object...args){
        events.add(new Event(object,methodName,args));
    }

    public void notifyALL() throws Exception {
        for (Event event : events) {
            event.invoke();
        }
    }
}
