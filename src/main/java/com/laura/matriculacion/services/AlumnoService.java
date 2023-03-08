package com.laura.matriculacion.services;

import java.util.List;

import com.laura.matriculacion.models.Alumno;

public interface AlumnoService {

    public List<Alumno> findAll();

    public Alumno findById(int codigo);

    public Alumno save(Alumno alumno);

    public void update(int codigo, Alumno alumno);

    public void deleteById(int codigo);

    public void deleteAll();
}
