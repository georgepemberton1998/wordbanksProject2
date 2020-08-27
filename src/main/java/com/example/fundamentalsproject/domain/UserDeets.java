package com.example.fundamentalsproject.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserDeets {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String UserName;

    @Column
    private String UserPass;

    public UserDeets(String userName, String userPass) {
        UserName = userName;
        UserPass = userPass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }
}

