package com.backend.tienda.service.impl;

import com.backend.tienda.domain.entities.Carrito_de_compras;
import com.backend.tienda.domain.repository.Carrito_de_compras_Repository;
import com.backend.tienda.service.Carrito_de_compras_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Carrito_de_compras_ServiceImpl implements Carrito_de_compras_Service {

    @Autowired
    private Carrito_de_compras_Repository carrito_de_compras_Repository;

    @Transactional(readOnly = true)
    @Override
    public Carrito_de_compras findById(long id) {
        return carrito_de_compras_Repository.findById(id).orElse(new Carrito_de_compras());
    }

    @Transactional(readOnly = true)
    @Override
    public List<Carrito_de_compras> findAll() {
        return carrito_de_compras_Repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Carrito_de_compras findByComprador(long compradorId) {
        return carrito_de_compras_Repository.findByCompradorId(compradorId).orElse(new Carrito_de_compras());
    }

    @Transactional
    @Override
    public Carrito_de_compras createCarrito_de_compras(Carrito_de_compras carrito_de_compras) {
        return carrito_de_compras_Repository.save(carrito_de_compras);
    }

    @Transactional
    @Override
    public Carrito_de_compras editCarrito_de_compras(Carrito_de_compras carrito_de_compras) {
        return carrito_de_compras_Repository.save(carrito_de_compras);
    }

    @Transactional
    @Override
    public boolean deleteCarrito_de_compras(long id) {
        if (carrito_de_compras_Repository.existsById(id)) {
            carrito_de_compras_Repository.deleteById(id);
            return true;
        }
        return false;
    }
}
