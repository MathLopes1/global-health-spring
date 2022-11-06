package com.global.health.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.global.health.entities.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> { }