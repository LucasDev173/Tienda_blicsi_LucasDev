package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Carrito_de_compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Carrito_de_compras_Repository extends JpaRepository <Carrito_de_compras, Long> {

    Optional<Carrito_de_compras> findByCompradorId(Long compradorId);

}
