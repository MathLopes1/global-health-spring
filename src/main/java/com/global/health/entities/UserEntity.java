package com.global.health.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "tb_user")
public class UserEntity extends AbstractEntity {
    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(unique = true)
    private String email;

    private String password;

    private String cpf;

    public UserEntity() { }
    
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
