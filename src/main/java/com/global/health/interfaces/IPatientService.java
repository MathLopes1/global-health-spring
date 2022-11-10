package com.global.health.interfaces;

import com.global.health.entities.PatientEntity;
import java.util.List;

public interface IPatientService {
    public PatientEntity create (PatientEntity patient); 
    public PatientEntity updated(PatientEntity patient, String patientId);
    public List<PatientEntity> findAll();
    public PatientEntity findById(String id);
    public void delete(String id);
}
