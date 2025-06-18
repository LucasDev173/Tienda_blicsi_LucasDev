package com.backend.tienda.domain.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Comprador")
public class Comprador extends Usuario{
    private String Cart_id;

    public Comprador(String ID, String Username, String Password) {
        super(ID, Username, Password);
    }
}
