package com.global.health.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_patient")
public class PatientEntity extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq")
    @SequenceGenerator(name = "patient_seq", allocationSize = 1)
    private Long id;

    private String name;

    private String healthInsuranceCardId;

    private String address;
    
    public PatientEntity(String name, String healthInsuranceCardId, String address) {
        super();
        this.name = name;
        this.healthInsuranceCardId = healthInsuranceCardId;
        this.address = address;
    } 

    public Long getId () {
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
