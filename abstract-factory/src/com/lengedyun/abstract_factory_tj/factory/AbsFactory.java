package com.lengedyun.abstract_factory_tj.factory;

/**
 * @title: AbsFactory
 * @description: 用于构建一个html
 * @auther: zhangjianyun
 * @date: 2022/6/20 17:19
 */
public abstract class AbsFactory {

    public static AbsFactory getInstance(String className) {
        AbsFactory absFactory = null;
        try {

            absFactory = (AbsFactory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(className + " 未找到");
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return absFactory;
    }

    public abstract AbsLink createLink(String url,String caption);

    public abstract AbsPage createPage(String title,String author);

    public abstract AbsTray createTray(String caption);

}
