package com.global.health.interfaces;

import com.global.health.entities.PatientEntity;
import java.util.List;
import java.util.UUID;

public interface IPatientService {
    public PatientEntity create (PatientEntity patient); 
    public PatientEntity updated(PatientEntity patient, UUID patientId);
    public List<PatientEntity> findAll();
    public PatientEntity findById(UUID id);
    public void delete(UUID id);
}
