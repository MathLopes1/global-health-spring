package com.global.health.repositories;

import org.springframework.stereotype.Repository;

import com.global.health.entities.UserEntity;

@Repository
public interface UserRepository extends AbstractRepository<UserEntity> {

    public UserEntity findByEmail(String email);

 }
