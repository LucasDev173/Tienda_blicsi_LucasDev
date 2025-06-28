package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "permisos", discriminatorType = DiscriminatorType.STRING)
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public Usuario(Object o, String username, String password) {
        this.username=username;
        this.password=password;
    }
}