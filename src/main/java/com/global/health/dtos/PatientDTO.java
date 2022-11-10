package com.global.health.dtos;

import java.io.Serializable;

import com.global.health.entities.PatientEntity;

public class PatientDTO implements Serializable {
    private static final long serialVersionUID = 1L;
 

    private String id;

    private String name;

    private String healthInsuranceCardId;

    private String address;
    
    public PatientDTO(PatientEntity object) {
        this.id = object.getId();
        this.name = object.getName();
        this.healthInsuranceCardId = object.getHealthInsuranceCardId();
        this.address = object.getAddress();
    } 

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getHealthInsuranceCardId () {
        return this.healthInsuranceCardId;
    }

    public void setHealthInsuranceCardId (String healthInsuranceCardId) {
        this.healthInsuranceCardId = healthInsuranceCardId;
    }

    public String getAddress () {
        return this.address;
    }

    public void setAddress (String address) {
        this.address = address;
    }
}
