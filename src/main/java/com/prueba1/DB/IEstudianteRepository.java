package com.prueba1.DB;

import com.prueba1.Entities.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface IEstudianteRepository extends CrudRepository<Estudiante, Integer>{
    
}
