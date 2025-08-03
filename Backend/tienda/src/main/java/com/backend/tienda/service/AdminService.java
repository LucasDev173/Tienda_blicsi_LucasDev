package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin>findAll();
    public List<Admin>findByName();
    public List<Admin>findByAcceso();
    public List<Admin>findByDepartamento();


}
