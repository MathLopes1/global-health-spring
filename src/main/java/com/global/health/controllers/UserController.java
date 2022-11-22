package com.global.health.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.health.dtos.UserDTO;
import com.global.health.entities.UserEntity;
import com.global.health.services.UserService;

@RestController
@RequestMapping(value="users")
public class UserController {
    private UserService userService;
    private ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    private UserDTO toPatientDTO(UserEntity user) {
        return this.modelMapper.map(user, UserDTO.class);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO user){
        UserEntity newUser = this.modelMapper.map(user, UserEntity.class);
        newUser = this.userService.create(newUser);

        return new ResponseEntity<UserDTO>(toPatientDTO(newUser),HttpStatus.CREATED);
    }
}
