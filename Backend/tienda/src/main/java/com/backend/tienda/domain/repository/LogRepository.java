package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository <Log,Long> {

    public List<Log> findByVentaComprador(Long ventaComprador);
    public List<Log> findByVentaVendedor(Long ventaVendedor);
    public List<Log> findByVentaProducto(Long ventaProducto);
    public List<Log> findByVentaPrecio(Long VentaPrecio);

}
