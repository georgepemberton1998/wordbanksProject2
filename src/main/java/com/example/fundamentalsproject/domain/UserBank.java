package com.example.fundamentalsproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserBank {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String word;

    @Column
    private String description;

    public UserBank() {
    }

    public UserBank(final String word, final String description) {
        this.word = word;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
