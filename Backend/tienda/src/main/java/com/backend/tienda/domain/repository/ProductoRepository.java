package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    public List<Producto> findByNombre (String nombre);
    public List<Producto> findByDetalle(String detalle);
    public List<Producto> findByPrecioLessThanEqual(Float precio);
    public List<Producto> findByPrecioGreaterThanEqual(Float precio);

    @Query("SELECT p FROM Producto p WHERE EXISTS ("
            + "SELECT 1 FROM p.tags t WHERE t IN :tags)")
    public List<Producto> findByAnyTag(@Param("tags") List<String> tags);

}
