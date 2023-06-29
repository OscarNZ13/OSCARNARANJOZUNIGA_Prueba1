package com.prueba1.Controllers;

import com.prueba1.Entities.Estudiante;
import com.prueba1.Service.IEstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EstudianteController {
    private final IEstudianteService estudianteService;

    public EstudianteController(IEstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }
    
    @GetMapping("/estudiante")
    public String index(Model model) {

        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("estudiante", this.estudianteService.getAllProducts());
        return "estudiante";
    }

    @PostMapping("estudiante/save")
    public String save(@ModelAttribute("estudiante") Estudiante estudent) {
        this.estudianteService.save(estudent);
        return "redirect:/estudiante";
    }

    @PostMapping("estudiante/delete")
    public ResponseEntity<String> delete(@RequestBody Estudiante estudent) {
        this.estudianteService.delete(estudent);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
