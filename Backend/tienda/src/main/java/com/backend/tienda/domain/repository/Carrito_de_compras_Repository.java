package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Carrito_de_compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carrito_de_compras_Repository extends JpaRepository <Carrito_de_compras, Long> {



}
