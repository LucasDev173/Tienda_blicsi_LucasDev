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
public class Comprador extends Usuario {

    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private boolean newsletter;
    @OneToOne(mappedBy = "comprador",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Carrito_de_compras carritoDeCompras;

    public Comprador(String username, String password, String direccion) {
        super(null, username, password);
        this.direccion = direccion;
        this.carritoDeCompras=new Carrito_de_compras();
    }
}
