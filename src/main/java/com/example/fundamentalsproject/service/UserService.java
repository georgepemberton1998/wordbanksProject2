package com.example.fundamentalsproject.service;

import com.example.fundamentalsproject.domain.UserDeets;
import com.example.fundamentalsproject.dto.UserDeetsDTO;
import com.example.fundamentalsproject.exceptions.UserNotFoundException;
import com.example.fundamentalsproject.repo.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository repo;


    @Autowired
    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public List<UserDeets> readAllUsers(){
        return this.repo.findAll();
    }
    public UserDeets createUser (UserDeets userDeets){

        return this.repo.save(userDeets);
    }

    public Boolean deleteUserById (Long id){
        if (!this.repo.existsById(id)) {
            throw new UserNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}
/*    private UserDeetsDTO mapToDTO(UserDeets userDeets) {
        return this.mapper.map(userDeets, UserDeetsDTO.class);
    }
    public List<UserDeetsDTO> readAllUsers(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public UserDeetsDTO createUser (UserDeets userDeets){
        return this.mapToDTO(this.repo.save(userDeets));
    }

    public Boolean deleteUserById (Long id){
        if (!this.repo.existsById(id)) {
            throw new UserNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}*/
