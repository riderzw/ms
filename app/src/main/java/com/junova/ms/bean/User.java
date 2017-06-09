package com.junova.ms.bean;

/**
 * Created by junova on 2017-03-27.
 */

public class User {
    private String userId = "";
    private String userName = "";

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}