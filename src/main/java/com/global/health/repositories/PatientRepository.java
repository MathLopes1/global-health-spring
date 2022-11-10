package com.global.health.repositories;

import org.springframework.stereotype.Repository;

import com.global.health.entities.PatientEntity;

@Repository
public interface PatientRepository extends AbstractRepository<PatientEntity> { }