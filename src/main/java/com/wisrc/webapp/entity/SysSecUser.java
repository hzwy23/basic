package com.wisrc.webapp.entity;

public class SysSecUser {
    private String userId;
    private String userPasswd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    @Override
    public String toString() {
        return "SysSecUser{" +
                "userId='" + userId + '\'' +
                ", userPasswd='" + userPasswd + '\'' +
                '}';
    }
}
