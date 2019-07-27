package com.lengedyun.switchdb.version2;

import com.lengedyun.switchdb.version1.User;

/**
 * @author zjy
 * @title: AccessUser_v2
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/7/27 17:11
 */
public class AccessUser_v2 implements IUser_v2{


    @Override
    public void insert(User user) {
        System.out.println("Access 新增一条用户记录:"+user.toString());
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("Access 查询一条用户记录id为:"+id);
        return null;
    }
}
