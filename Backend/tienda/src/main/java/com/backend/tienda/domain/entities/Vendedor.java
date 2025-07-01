package com.backend.tienda.domain.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Vendedor")
public class Vendedor extends Usuario {
    private String direccion;
    private String telefono;

    public Vendedor(String username, String password, String direccion) {
        super(null, username, password);
        this.direccion = direccion;
    }
}
