package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Vendedor;

import java.util.List;

public interface VendedorService {
    public Vendedor findById(long id);
    public List<Vendedor> findAll();
    public List<Vendedor> findByName(String name);
    public Vendedor createVendedor(Vendedor vendedor);
    public Vendedor editVendedor(Vendedor vendedor, long id);
    public boolean deleteVendedor(long id);
}
