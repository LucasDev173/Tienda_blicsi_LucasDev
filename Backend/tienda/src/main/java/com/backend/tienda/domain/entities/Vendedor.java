package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@DiscriminatorValue(value = "VENDEDOR")
public class Vendedor extends Usuario {
    @Column
    private String direccion;
    @Column
    private String telefono;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "PRODUCTOS_VENDEDOR",
                joinColumns = @JoinColumn(name = "carrito_id"),
                inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productos;

    @OneToMany(mappedBy = "vendedor")
    private List<Reporte_ventas> reportesVentas;

    public Vendedor(String username, String password, String direccion) {
        super(null, username, password);
        this.direccion = direccion;
    }
}
