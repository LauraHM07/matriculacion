package com.laura.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.matriculacion.models.Alumno;
import com.laura.matriculacion.repositories.AlumnoRepository;
import com.laura.matriculacion.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository repository;

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno findById(int codigo) {
        Optional<Alumno> findById = repository.findById(codigo);

        if(findById != null) {
            return findById.get();
        }

        return null;
    }

    @Override
    public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    @Override
    public void update(int codigo, Alumno alumno) {
        this.findById(codigo);

        alumno.setCodigo(codigo);

        repository.save(alumno);
    }

    @Override
    public void deleteById(int codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public void deleteAll() {
       repository.deleteAll();
    }
}
