package com.backend.tienda.service.impl;

import com.backend.tienda.domain.entities.Vendedor;
import com.backend.tienda.domain.repository.VendedorRepostory;
import com.backend.tienda.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VendedorServiceImpl implements VendedorService {

    @Autowired
    public VendedorRepostory vendedorRepostory;

    @Override
    public Optional<Vendedor> findById(long id) {
        return vendedorRepostory.findById(id);
    }

    @Override
    public List<Vendedor> findAll() {
        return vendedorRepostory.findAll();
    }

    @Override
    public List<Vendedor> findByName(String name) {
        return vendedorRepostory.buscarPorNombreUsuarioaVendedor(name);
    }

    @Override
    public List<Vendedor> findByDireccion(String direccion) {
        return vendedorRepostory.findByDireccion(direccion);
    }

    @Override
    public List<Vendedor> findByTelefono(String telefono) {
        return vendedorRepostory.findByTelefono(telefono);
    }

    @Override
    public Vendedor createVendedor(Vendedor vendedor) {
        return vendedorRepostory.save(vendedor);
    }

    @Override
    public Vendedor editVendedor(Vendedor vendedor) {
        return vendedorRepostory.save(vendedor);
    }

    @Override
    public boolean deleteVendedor(long id) {
        if (vendedorRepostory.existsById(id)){
            vendedorRepostory.deleteById(id);
            return true;
        }
        return false;
    }
}
