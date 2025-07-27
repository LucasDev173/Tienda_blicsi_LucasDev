package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Admin;
import com.backend.tienda.domain.entities.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador,Long> {

    List<Comprador> findByDireccion(String direccion);
    List<Comprador> findByTelefono(String telefono);
    List<Comprador> findByNewsletterTrue();

    @Query("SELECT a FROM Comprador a JOIN Usuario u ON a.id = u.id WHERE u.username LIKE %:nombre%")
    List<Comprador> buscarPorNombreUsuarioaComprador(String nombre);

}
