package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Reporte_ganancias;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Reporte_ganancia_Repository extends JpaRepository<Reporte_ganancias,Long> {

   // public List<Reporte_ganancias> findByPrecioLessThanEqual(Float precio);
    //public List<Reporte_ganancias> findByPrecioGreaterThanEqual(Float precio);

}
