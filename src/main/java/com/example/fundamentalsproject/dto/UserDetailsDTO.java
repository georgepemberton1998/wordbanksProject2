package com.example.fundamentalsproject.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDetailsDTO {
    private Long id;
    private String userName;
    private List<UserWordDTO> userWords = new ArrayList<>();

    public UserDetailsDTO() {
    }

    public UserDetailsDTO(String userName) { this.userName = userName; }

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

    public List<UserWordDTO> getUserWords() {
        return userWords;
    }

    public void setUserWords(List<UserWordDTO> userWords) {
        this.userWords = userWords;
    }
}

