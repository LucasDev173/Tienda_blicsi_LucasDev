package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariorRepository extends JpaRepository<Usuario,Long> {
    public List<Usuario>findByUsername(String name);
}
