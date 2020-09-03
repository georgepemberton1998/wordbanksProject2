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

    @ManyToOne(targetEntity = UserDetails.class)
    private UserDetails userDetails;

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

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
