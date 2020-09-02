package com.example.fundamentalsproject.domain;

import javax.persistence.*;

@Entity
public class UserWord {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String word;

    @Column
    private String definition;

    @ManyToOne(targetEntity = UserDeets.class)
    private UserDeets userDeets;

    public UserWord() {
    }

    public UserWord(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(final String title) {
        this.word = title;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(final String definition) {
        this.definition = definition;
    }

    public UserDeets getUserDeets() { return userDeets; }

    public void setUserDeets(UserDeets userDeets) { this.userDeets = userDeets; }
}
