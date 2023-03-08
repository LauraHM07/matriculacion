package com.laura.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laura.matriculacion.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}
