package com.example.fundamentalsproject.rest;

import com.example.fundamentalsproject.domain.UserDetails;
import com.example.fundamentalsproject.dto.UserDetailsDTO;
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
    public ResponseEntity<List<UserDetailsDTO>> getAllUsers() {
        return ResponseEntity.ok(this.userService.readAllUsers());
    }

    @PostMapping("/createUser")
    public ResponseEntity<UserDetailsDTO> createUser(@RequestBody UserDetails userDetails){
        return new ResponseEntity<UserDetailsDTO>(this.userService.createUser(userDetails), HttpStatus.CREATED);
    }


    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?>  deleteUser(@PathVariable Long id){
        return this.userService.deleteUserById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

}