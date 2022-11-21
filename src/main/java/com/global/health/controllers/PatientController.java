package com.global.health.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global.health.dtos.PatientDTO;
import com.global.health.entities.PatientEntity;
import com.global.health.services.PatientService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="patient")
public class PatientController {
    private PatientService patientService;
    private ModelMapper modelMapper;

    public PatientController(PatientService patientService, ModelMapper modelMapper) {
        this.patientService = patientService;
        this.modelMapper = modelMapper;
    }

    private PatientDTO toPatientDTO(PatientEntity patient) {
        return this.modelMapper.map(patient, PatientDTO.class);
    }
    
    @PostMapping
    public ResponseEntity<PatientDTO> create(@RequestBody PatientDTO patient){
        PatientEntity newPatient = this.modelMapper.map(patient, PatientEntity.class);
        newPatient = this.patientService.create(newPatient);

        return new ResponseEntity<PatientDTO>(toPatientDTO(newPatient),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
 	public ResponseEntity<PatientDTO> update(@RequestBody PatientDTO patientDTO, @PathVariable(value = "id") UUID id) {  
        PatientEntity updatePatient = this.modelMapper.map(patientDTO, PatientEntity.class);
        updatePatient = this.patientService.updated(updatePatient, id);

		return new ResponseEntity<PatientDTO>(toPatientDTO(updatePatient),HttpStatus.OK);
	}

    @GetMapping
	public ResponseEntity<List<PatientDTO>> findAll() {
		List<PatientEntity> list = this.patientService.findAll();
		List<PatientDTO> listDto = list.stream()
            .map(this::toPatientDTO)
            .collect(Collectors.toList());

		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PatientDTO> findById(@PathVariable UUID id) {
		PatientEntity patient = this.patientService.findById(id);

		return new ResponseEntity<PatientDTO>(toPatientDTO(patient),HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable UUID id) {
		this.patientService.delete(id);

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
