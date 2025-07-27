package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Reporte_ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reporte_ventas_Repository extends JpaRepository<Reporte_ventas,Long> {
}
