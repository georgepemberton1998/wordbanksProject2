package com.example.fundamentalsproject.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserDeets {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userName;

    @OneToMany(mappedBy = "userDeets", fetch = FetchType.EAGER)
    private List<UserWord> UserWords = new ArrayList<>();

    public UserDeets(){}

    public UserDeets(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<UserWord> getUserWords() {
        return UserWords;
    }

    public void setUserWords(List<UserWord> words) {
        this.UserWords = words;
    }
}


