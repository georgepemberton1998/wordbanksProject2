package com.example.fundamentalsproject.service;

import com.example.fundamentalsproject.domain.UserDetails;
import com.example.fundamentalsproject.dto.UserDetailsDTO;
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
    private final ModelMapper mapper;

    @Autowired
    public UserService(UserRepository repo, ModelMapper mapper){
        this.repo = repo;
        this.mapper = mapper;
    }
    private UserDetailsDTO mapToDTO(UserDetails userDetails) {
        return this.mapper.map(userDetails, UserDetailsDTO.class);
    }
    public List<UserDetailsDTO> readAllUsers(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public UserDetailsDTO createUser (UserDetails userDetails){
        return this.mapToDTO(this.repo.save(userDetails));
    }

    public Boolean deleteUserById (Long id){
        if (!this.repo.existsById(id)) {
            throw new UserNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}

