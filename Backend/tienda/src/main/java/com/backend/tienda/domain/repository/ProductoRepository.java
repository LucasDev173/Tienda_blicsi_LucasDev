package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    List<Producto> findByNombre (String nombre);
    List<Producto> findByDetalle(String detalle);
    List<Producto> findByPrecioLessThanEqual(Float precio);
    List<Producto> findByPrecioGreaterThanEqual(Float precio);

    @Query("SELECT p FROM Producto p WHERE EXISTS ("
            + "SELECT 1 FROM p.tags t WHERE t IN :tags)")
    List<Producto> findByAnyTag(@Param("tags") List<String> tags);

}
