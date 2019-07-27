package com.lengedyun.switchdb.version2;

import com.lengedyun.switchdb.version1.User;

public interface IUser_v2 {

    void insert(User user);

    User getUser(Integer id);
}
