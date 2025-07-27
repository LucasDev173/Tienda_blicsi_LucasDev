package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariorRepository extends JpaRepository<Usuario,Long> {
}
