package com.global.health.entities;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public abstract class AbstractEntity {
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate createdAt;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate updatedAt;

    public LocalDate getCreatedAt () {
        return this.createdAt;
    }

    public void setCreatedAt (LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt () {
        return this.updatedAt;
    }

    public void setUpdatedAt (LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
