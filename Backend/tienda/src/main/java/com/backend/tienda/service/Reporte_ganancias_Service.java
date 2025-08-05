package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Reporte_ganancias;

import java.util.List;

public interface Reporte_ganancias_Service {
    public Reporte_ganancias findById(long id);
    public List<Reporte_ganancias> findAll();
    public Reporte_ganancias createReporte_ganancias(Reporte_ganancias reporte_ganancias);
    public Reporte_ganancias editReporte_ganancias(Reporte_ganancias reporte_ganancias, long id);
    public boolean deleteReporte_ganancias(long id);
}
