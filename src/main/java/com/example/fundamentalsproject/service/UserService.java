package com.example.fundamentalsproject.service;

import com.example.fundamentalsproject.domain.UserDeets;
import com.example.fundamentalsproject.exceptions.UserNotFoundException;
import com.example.fundamentalsproject.exceptions.WordNotFoundException;
import com.example.fundamentalsproject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public UserDeets createUser(UserDeets userDeets){
        return this.repo.save(userDeets);
    }

    public Boolean deleteUserById(Long id){
        if(!this.repo.existsById(id)){
            throw new UserNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
