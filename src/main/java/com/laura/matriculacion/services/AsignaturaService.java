package com.laura.matriculacion.services;

import java.util.List;

import com.laura.matriculacion.models.Asignatura;

public interface AsignaturaService {
    
    public List<Asignatura> findAll();

    public Asignatura findById(String codigo);

    public Asignatura save(Asignatura asignatura);

    public void update(String codigo, Asignatura asignatura);

    public void deleteById(String codigo);

    public void deleteAll();
}
