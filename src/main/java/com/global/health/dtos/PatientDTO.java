package com.global.health.dtos;

import java.util.UUID;

public class PatientDTO extends AbstractDTO {

    private UUID id;

    private String name;

    private String healthInsuranceCardId;

    private String address;
    
    public UUID getId () {
        return this.id;
    }

    public void setId (UUID id) {
        this.id = id;
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
