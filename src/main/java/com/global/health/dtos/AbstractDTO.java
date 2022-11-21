package com.global.health.dtos;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

public abstract class AbstractDTO {
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
