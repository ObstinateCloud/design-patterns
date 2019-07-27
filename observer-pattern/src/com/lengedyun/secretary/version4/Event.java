package com.lengedyun.secretary.version4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zjy
 * @title: Event
 * @projectName design-patterns
 * @description: 事件对象
 * @date 2019/7/27 13:48
 */
public class Event {

    //要执行方法的对象
    private Object object;
    //方法名
    private String methodName;
    //参数列表
    private Object[] params;
    //参数类型
    private Class[] paramTypes;

    public Event(){

    }

    public Event(Object object, String methodName, Object...params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    //根据参数数组生产参数类型数据
    private void contractParamTypes(Object[] params){
        paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    /* *
     * 功能描述: 执行对象的方法
     * @param: []
     * @return: void
     * @date: 2019/7/27 13:55
     */
    public void invoke() throws Exception{

        Method method = object.getClass().getMethod(getMethodName(),getParamTypes());
        if (method==null){
            return;
        }
        method.invoke(getObject(),getParams());
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
