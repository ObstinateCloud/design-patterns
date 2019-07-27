package com.lengedyun.switchdb.version1;

/**
 * @author zjy
 * @title: User
 * @projectName design-patterns
 * @description: 用户类
 * @date 2019/7/27 16:46
 */
public class User {

    private Integer id;

    private String userName;

    public User() {
    }


    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
