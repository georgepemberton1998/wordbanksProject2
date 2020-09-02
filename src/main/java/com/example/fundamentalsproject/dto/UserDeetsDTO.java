package com.example.fundamentalsproject.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDeetsDTO {
    private Long id;
    private String UserName;
    private List<UserWordDTO> userWord = new ArrayList<>();

    public UserDeetsDTO() {
    }

    public UserDeetsDTO(String userName,List<UserWordDTO> userWord) {
        this.UserName = userName;
        this.userWord = userWord;
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

    public List<UserWordDTO> getUserWord() {
        return userWord;
    }

    public void setUserWord(List<UserWordDTO> userWord) {
        this.userWord = userWord;
    }
}

