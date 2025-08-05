package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario findById(long id);
    public List<Usuario> findAll();
    public List<Usuario> findByName(String name);
    public Usuario editUsuario(Usuario usuario, long id);
    public boolean deleteUsuario(long id);
}
