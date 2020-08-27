package com.example.fundamentalsproject.service;

import com.example.fundamentalsproject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
}
