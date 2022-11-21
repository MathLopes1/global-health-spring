package com.global.health.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.global.health.entities.PatientEntity;
import com.global.health.interfaces.IPatientService;
import com.global.health.repositories.PatientRepository;
import com.global.health.utils.fieldsValidation;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientService implements IPatientService {
    private final PatientRepository patientRepository;

    protected PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientEntity create(PatientEntity patient) {
		fieldsValidation.validatePatient(patient);
	
		patient.setUpdatedAt(LocalDate.now());
		patient.setCreatedAt(LocalDate.now());

        return patientRepository.save(patient);
    }

    public PatientEntity updated(PatientEntity patient, UUID patientId) {
		PatientEntity updatedPatient = this.findById(patientId);
		this.updateData(updatedPatient, patient);
		return this.patientRepository.save(updatedPatient);
	}

	private void updateData(PatientEntity updatedPatient, PatientEntity patient) {
		updatedPatient.setName(patient.getName());
		updatedPatient.setUpdatedAt(LocalDate.now());
		updatedPatient.setHealthInsuranceCardId(patient.getHealthInsuranceCardId());
		updatedPatient.setAddress(patient.getAddress());;
	}

    public List<PatientEntity> findAll() {
		return this.patientRepository.findAll();
	}

	public PatientEntity findById(UUID id) {
		Optional<PatientEntity> patient = this.patientRepository.findById(id);
		return patient.orElseThrow(() -> new Error("object not found"));
	}

	public void delete(UUID id) {
		this.findById(id);
		this.patientRepository.deleteById(id);
	}
}
