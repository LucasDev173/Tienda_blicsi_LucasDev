package com.backend.tienda.service.impl;

import com.backend.tienda.domain.entities.Comprador;
import com.backend.tienda.domain.repository.CompradorRepository;
import com.backend.tienda.service.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompradorServiceImpl implements CompradorService {

    @Autowired
    private CompradorRepository compradorRepository;

    @Override
    public Optional<Comprador> findById(long id) {
        return compradorRepository.findById(id);
    }

    @Override
    public List<Comprador> findAll() {
        return compradorRepository.findAll();
    }

    @Override
    public List<Comprador> findByName(String name) {
        return compradorRepository.buscarPorNombreUsuarioaComprador(name);
    }

    @Override
    public Comprador createComprador(Comprador comprador) {
        return compradorRepository.save(comprador);
    }

    @Override
    public Comprador editComprador(Comprador comprador) {
        return compradorRepository.save(comprador);
    }

    @Override
    public boolean deleteComprador(long id) {
        if (compradorRepository.existsById(id)){
            compradorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
