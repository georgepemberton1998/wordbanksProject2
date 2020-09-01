package com.example.fundamentalsproject.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDeetsDTO {
    private Long id;
    private String UserName;
    private List<userWordDTO> userWord = new ArrayList<>();

    public UserDeetsDTO() {
    }

    public UserDeetsDTO(String userName,List<userWordDTO> userWord) {
        UserName = userName;
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

    public List<userWordDTO> getUserWord() {
        return userWord;
    }

    public void setUserWord(List<userWordDTO> userWord) {
        this.userWord = userWord;
    }
}

