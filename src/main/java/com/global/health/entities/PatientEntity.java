package com.global.health.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "tb_patient")
public class PatientEntity extends AbstractEntity {


    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    private String name;

    private String healthInsuranceCardId;

    private String address;
    
    public PatientEntity() { } 

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
