package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Admin;
import com.backend.tienda.domain.entities.Comprador;
import com.backend.tienda.domain.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendedorRepostory extends JpaRepository<Vendedor,Long> {

    List<Vendedor> findByDireccion(String direccion);
    List<Vendedor> findByTelefono(String telefono);

    @Query("SELECT a FROM Vendedor a JOIN Usuario u ON a.id = u.id WHERE u.username LIKE %:nombre%")
    List<Vendedor> buscarPorNombreUsuarioaVendedor(String nombre);
}
