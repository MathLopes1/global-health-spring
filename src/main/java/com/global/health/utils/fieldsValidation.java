package com.global.health.utils;

import com.global.health.entities.PatientEntity;
import com.global.health.exeception.BadRequestException;

public class fieldsValidation {
    public static void validatePatient(PatientEntity patient) {
        if(patient.getName() == null) {
            throw new BadRequestException("Nome não pode ser vázio");
        }

        if(patient.getName().length() < 5) {
            throw new BadRequestException("Digite um nome válido");
        }

        if(patient.getHealthInsuranceCardId() == null) {
            throw new BadRequestException("Insurance Card não pode ser vázio");
        }

        if(patient.getAddress().length() < 5) {
            throw new BadRequestException("Digite um endereço válido");
        }
    }
}
