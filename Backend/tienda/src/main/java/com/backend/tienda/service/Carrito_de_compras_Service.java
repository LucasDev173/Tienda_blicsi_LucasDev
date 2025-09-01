package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Carrito_de_compras;

import java.util.List;

public interface Carrito_de_compras_Service {
    public Carrito_de_compras findById(long id);
    public List<Carrito_de_compras> findAll();
    public Carrito_de_compras findByComprador(long compradorId);
    public Carrito_de_compras createCarrito_de_compras(Carrito_de_compras carrito_de_compras);
    public Carrito_de_compras editCarrito_de_compras(Carrito_de_compras carrito_de_compras);
    public boolean deleteCarrito_de_compras(long id);
}
