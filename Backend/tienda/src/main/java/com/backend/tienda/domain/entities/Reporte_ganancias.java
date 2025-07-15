package com.backend.tienda.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Reporte_ganancias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="vendedor_id")
    private Vendedor vendedor;

    @OneToMany(mappedBy = "reporteGanancias")
    private List<Reporte_ventas> reportesVentas;

    @Column
    private float gananciaTotal;
}
