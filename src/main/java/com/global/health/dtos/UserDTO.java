package com.global.health.dtos;

import java.util.UUID;

public class UserDTO extends AbstractDTO {
    private UUID id;

    private String email;

    private String password;

    private String cpf;

    public UserDTO() { }
    
    public UUID getId () {
        return this.id;
    }

    public void setId (UUID id) {
        this.id = id;
    }

    public String getEmail () {
        return this.email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return this.password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getCpf () {
        return this.cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
}
