package com.backend.tienda.domain.repository;

import com.backend.tienda.domain.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    public List<Admin> findByNivelAcceso(String nivelAcceso);

    public List<Admin> findByDepartamento(String departamento);

    @Query("SELECT a FROM Admin a JOIN Usuario u ON a.id = u.id WHERE u.username LIKE %:nombre%")
    List<Admin> buscarPorNombreUsuarioAdmin(String nombre);
}

