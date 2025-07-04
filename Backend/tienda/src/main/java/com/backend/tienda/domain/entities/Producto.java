package com.backend.tienda.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private List<String>tags;
    @Column
    private String nombre;
    @Column
    private String detalle;
    @Column
    private Float precio;
    @ManyToOne
    private Carrito_de_compras carrito;
    @ManyToMany(mappedBy = "productos", fetch = FetchType.EAGER)
    private List<Vendedor> vendedores;
}
