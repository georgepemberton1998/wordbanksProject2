package com.example.fundamentalsproject.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "notes"})

@Entity
public class UserDeets {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String UserName;

    @OneToMany(mappedBy = "UserDeets", fetch = FetchType.LAZY)
    private List<UserWord> words = new ArrayList<>();

    public UserDeets(){}

    public UserDeets(String userName) {
        UserName = userName;
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

    public List<UserWord> getWords() {
        return words;
    }

    public void setWords(List<UserWord> words) {
        this.words = words;
    }
}


