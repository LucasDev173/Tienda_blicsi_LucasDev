package com.backend.tienda.service.impl;

import com.backend.tienda.domain.entities.Usuario;
import com.backend.tienda.domain.repository.UsuariorRepository;
import com.backend.tienda.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    public UsuariorRepository usuariorRepository;

    @Override
    public Optional<Usuario> findById(long id) {
        return usuariorRepository.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuariorRepository.findAll();
    }

    @Override
    public List<Usuario> findByUsername(String name) {
        return usuariorRepository.findByUsername(name);
    }

    @Override
    public Usuario editUsuario(Usuario usuario) {
        return usuariorRepository.save(usuario);
    }

    @Override
    public boolean deleteUsuario(long id) {
        if (usuariorRepository.existsById(id)){
            usuariorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
