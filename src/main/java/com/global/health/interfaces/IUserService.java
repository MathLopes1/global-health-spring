package com.global.health.interfaces;

import com.global.health.entities.UserEntity;

public interface IUserService {
    public UserEntity create (UserEntity user); 
    public UserEntity findByEmail(String email);
}
