package com.prueba1.Service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.prueba1.Entities.Estudiante;
import com.prueba1.Service.IEstudianteService;
import com.prueba1.DB.IEstudianteRepository;

@Service
public class EstudianteService implements IEstudianteService {

    private final IEstudianteRepository estudianteRepository;

    // Contructor:

    public EstudianteService(IEstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    // metodos de interface
    @Override
    public List<Estudiante> getAllProducts() {
        return (List<Estudiante>) this.estudianteRepository.findAll();
    }

    @Override
    public void save(Estudiante estudent) {
        this.estudianteRepository.save(estudent);
    }

    @Override
    public void delete(Estudiante estudent) {
        this.estudianteRepository.delete(estudent);
    }

}
