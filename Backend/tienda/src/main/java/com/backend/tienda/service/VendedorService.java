package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Vendedor;

import java.util.List;
import java.util.Optional;

public interface VendedorService {
    public Optional<Vendedor> findById(long id);
    public List<Vendedor> findAll();
    public List<Vendedor> findByName(String name);
    public List<Vendedor> findByDireccion(String direccion);
    public List<Vendedor> findByTelefono(String telefono);
    public Vendedor createVendedor(Vendedor vendedor);
    public Vendedor editVendedor(Vendedor vendedor);
    public boolean deleteVendedor(long id);
}
