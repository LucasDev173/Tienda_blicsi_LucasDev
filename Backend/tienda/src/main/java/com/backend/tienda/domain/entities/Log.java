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
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="reporte_ventas_id")
    private Reporte_ventas reporteVentas;
    @Column
    private long ventaComprador;
    @Column
    private long ventaVendedor;
    @Column
    private long ventaProducto;
    @Column
    private long ventaPrecio;
}
