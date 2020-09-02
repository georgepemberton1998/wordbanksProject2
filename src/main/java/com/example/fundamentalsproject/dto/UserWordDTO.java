package com.example.fundamentalsproject.dto;

public class UserWordDTO {
    private Long id;
    private String word;
    private String definition;

    public UserWordDTO() {
    }

    public UserWordDTO(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

