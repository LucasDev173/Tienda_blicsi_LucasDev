package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "permisos")
@Setter
@Getter

public abstract class Usuario {
    @Id
    private String id;
    private String username;
    private String password;

    public Usuario (String ID, String Username,String Password){
        super();
        this.id=ID;
        this.username=Username;
        this.password=Password;
    }
}
