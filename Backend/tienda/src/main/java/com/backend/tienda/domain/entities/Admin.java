package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("ADMIN")
@Getter
@Setter
@NoArgsConstructor
public class Admin extends Usuario {

    private String nivelAcceso;

    @Column(name = "departamento")
    private String departamento;

    // Constructor específico
    public Admin(String username, String password, String nivelAcceso, String departamento) {
        super(null, username, password);
        this.nivelAcceso = nivelAcceso;
        this.departamento = departamento;
    }
}