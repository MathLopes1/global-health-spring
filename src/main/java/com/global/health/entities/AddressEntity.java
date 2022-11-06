package com.global.health.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class AddressEntity extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", allocationSize = 1)
    private Long id;

    private String addressState;

    private String addressDistrict;

    private String postalCode;

    private String addressStreet;

    private String addresNumber;

    public AddressEntity(String addressState, String addressDistrict, String postalCode, String addressStreet, String addresNumber ) {
        super();
        this.addressState = addressStreet;
        this.addressDistrict = addressDistrict;
        this.postalCode = postalCode;
        this.addressStreet = addressStreet;
        this.addresNumber = addresNumber;
    }

    public Long getId () {
        return this.id;
    }

    public String getAddressState () {
        return this.addressState;
    }

    public void setAddressState (String addressState) {
        this.addressState = addressState;
    }

    public String getAddressDistrict () {
        return this.addressDistrict;
    }

    public void setAddressDistrict (String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getPostalCode () {
        return this.postalCode;
    }

    public void setPostalCode (String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressStreet () {
        return this.addressStreet;
    }

    public void setAddressStreet (String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddresNumber () {
        return this.addresNumber;
    }

    public void setAddresNumber (String addresNumber) {
        this.addresNumber = addresNumber;
    }
}
