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
public class Carrito_de_compras {
    @Id
    @Column(name = "comprador_id")
    private String id;
    @OneToMany(mappedBy = "carrito", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List <Producto> productos;

    @OneToOne
    @MapsId
    @JoinColumn(name = "comprador_id")
    private Comprador comprador;
}
