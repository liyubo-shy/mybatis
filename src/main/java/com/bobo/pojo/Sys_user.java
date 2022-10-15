package com.bobo.pojo;

/**
 * @Author: bo
 * @DATE: 2022/10/14 2:04
 **/
public class Sys_user {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Sys_user{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
