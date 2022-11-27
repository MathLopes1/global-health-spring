package com.global.health.services;

import com.global.health.entities.UserEntity;
import com.global.health.exeception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService service;

    @Override
    public UserDetails loadUserByUsername(String email) throws NotFoundException {
        UserEntity user = this.service.findByEmail(email);

        return new User(email, user.getPassword(), new ArrayList<>());
    }
}
