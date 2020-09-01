package com.example.fundamentalsproject.rest;

import com.example.fundamentalsproject.domain.UserDeets;
import com.example.fundamentalsproject.dto.UserDeetsDTO;
import com.example.fundamentalsproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public ResponseEntity<List<UserDeetsDTO>> getAllUsers() {
        return ResponseEntity.ok(this.userService.readAllUsers());
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserDeetsDTO> createUser(@RequestBody UserDeets userDeets){
        return new ResponseEntity<UserDeetsDTO>(this.userService.createUser(userDeets), HttpStatus.CREATED);
    }


    @DeleteMapping("/deleteUser/{id}")
    public Boolean deleteUser(@PathVariable Long id){
        return this.userService.deleteUserById(id);
    }
}
