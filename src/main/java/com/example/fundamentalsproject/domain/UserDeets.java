package com.example.fundamentalsproject.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class UserDeets {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userName;

    @OneToMany(mappedBy = "userDeets", fetch = FetchType.EAGER)
    private List<UserWord> words = new ArrayList<>();

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

    public List<UserWord> getWords() {
        return words;
    }

    public void setWords(List<UserWord> words) {
        this.words = words;
    }
}


