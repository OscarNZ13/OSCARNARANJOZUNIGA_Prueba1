package com.prueba1.Service;

import java.util.List;

import com.prueba1.Entities.Estudiante;

public interface IEstudianteService {
    List<Estudiante> getAllProducts();

    void save(Estudiante estudent);

    void delete(Estudiante estudent);
}
