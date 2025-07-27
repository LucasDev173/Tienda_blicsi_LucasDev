package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository <Log,Long> {

    List<Log> findByVentaComprador(Long ventaComprador);
    List<Log> findByVentaVendedor(Long ventaVendedor);
    List<Log> findByVentaProducto(Long ventaProducto);
    List<Log> findByVentaPrecio(Long VentaPrecio);

}
