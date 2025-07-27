package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Admin extends Usuario {

    @Column
    private String nivelAcceso;

    @Column
    private String departamento;

    // Constructor específico
    public Admin(String username, String password, String nivelAcceso, String departamento) {
        super(username, password);
        this.nivelAcceso = nivelAcceso;
        this.departamento = departamento;
    }
}