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
    private String definition;

    public UserBank() {
    }

    public UserBank(final String word, final String definition) {
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
}
