package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Reporte_ventas;

import java.util.List;

public interface Reporte_ventas_Service {
    public Reporte_ventas findById(long id);
    public List<Reporte_ventas> findAll();
    public Reporte_ventas findByReporteGanancias(long reporteGananciasId);
    public Reporte_ventas createReporte_ventas(Reporte_ventas reporte_ventas);
    public Reporte_ventas editReporte_ventas(Reporte_ventas reporte_ventas, long id);
    public boolean deleteReporte_ventas(long id);
}
