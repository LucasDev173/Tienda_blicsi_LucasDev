package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Producto;

import java.util.List;

public interface ProductoService {
    public Producto findById(long id);
    public List<Producto> findAll();
    public List<Producto> findByName(String name);
    public List<Producto> findByTags(List<String> tags);
    public Producto createProducto(Producto vendedor);
    public Producto editProducto(Producto vendedor, long id);
    public boolean deleteProducto(long id);
}
