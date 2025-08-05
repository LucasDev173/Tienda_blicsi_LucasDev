package com.backend.tienda.service;

import com.backend.tienda.domain.entities.Log;

import java.util.List;

public interface LogService {
    public Log findById(long id);
    public List<Log> findAll();
    public Log createLog(Log log);
    public Log editLog(Log log);
    public boolean deleteLog(long id);
}
