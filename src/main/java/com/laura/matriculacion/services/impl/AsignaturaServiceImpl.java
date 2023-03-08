package com.laura.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.matriculacion.models.Asignatura;
import com.laura.matriculacion.repositories.AsignaturaRepository;
import com.laura.matriculacion.services.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {
    
    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<Asignatura> findAll() {
        return repository.findAll();
    }

    @Override
    public Asignatura findById(String codigo) {
        Optional<Asignatura> findById = repository.findById(codigo);

        if(findById != null) {
            return findById.get();
        }

        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return repository.save(asignatura);
    }

    @Override
    public void update(String codigo, Asignatura asignatura) {
        this.findById(codigo);

        asignatura.setCodigo(codigo);

        repository.save(asignatura);
    }

    @Override
    public void deleteById(String codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public void deleteAll() {
       repository.deleteAll();
    }
}
