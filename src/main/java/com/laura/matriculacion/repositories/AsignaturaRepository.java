package com.laura.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laura.matriculacion.models.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, String>{
    
}
