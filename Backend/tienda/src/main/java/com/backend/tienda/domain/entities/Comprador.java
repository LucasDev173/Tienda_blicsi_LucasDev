package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("CLIENTE")
@Getter
@Setter
@NoArgsConstructor
public class Comprador extends Usuario {

    private String direccion;
    private String telefono;
    private boolean newsletter;

    public Comprador(String username, String password, String direccion) {
        super(null, username, password);
        this.direccion = direccion;
    }
}
