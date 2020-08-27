package com.example.fundamentalsproject.rest;

import com.example.fundamentalsproject.domain.UserDeets;
import com.example.fundamentalsproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/createUser")
    public UserDeets createUser(@RequestBody UserDeets userDeets){
        return this.userService.createUser(userDeets);
    }


    @DeleteMapping("/deleteUser/{id}")
    public Boolean deleteUser(@PathVariable Long id){
        return this.userService.deleteUserById(id);
    }
}
