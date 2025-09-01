package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public Optional<Usuario> findById(long id);
    public List<Usuario> findAll();
    public List<Usuario> findByUsername(String name);
    public Usuario editUsuario(Usuario usuario);
    public boolean deleteUsuario(long id);
}
