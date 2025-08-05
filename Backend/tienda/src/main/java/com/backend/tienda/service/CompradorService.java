package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Comprador;

import java.util.List;

public interface CompradorService {
    public Comprador findById(long id);
    public List<Comprador> findAll();
    public List<Comprador> findByName(String name);
    public Comprador createComprador(Comprador comprador);
    public Comprador editComprador(Comprador comprador, long id);
    public boolean deleteComprador(long id);
}
