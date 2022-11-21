package com.global.health.utils;

import com.global.health.entities.PatientEntity;

public class fieldsValidation {
    public static void validatePatient(PatientEntity patient) {
        if(patient.getName() == null) {
            throw new Error("Nome não pode ser vázio");
        }

        if(patient.getName().length() < 5) {
            throw new Error("Digite um nome válido");
        }

        if(patient.getHealthInsuranceCardId() == null) {
            throw new Error("Insurance Card não pode ser vázio");
        }

        if(patient.getAddress().length() < 5) {
            throw new Error("Digite um endereço válido");
        }
    }
}
