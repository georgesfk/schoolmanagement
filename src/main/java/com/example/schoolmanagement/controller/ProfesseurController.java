package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Professeur;
import com.example.schoolmanagement.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professeurs")
public class ProfesseurController {

    @Autowired
    private ProfesseurService professeurService;

    @GetMapping
    public List<Professeur> getAllProfesseurs() {
        return professeurService.getAllProfesseurs();
    }

    @GetMapping("/{id}")
    public Professeur getProfesseurById(@PathVariable Long id) {
        return professeurService.getProfesseurById(id);
    }

    @PostMapping
    public Professeur createProfesseur(@RequestBody Professeur professeur) {
        return professeurService.createProfesseur(professeur);
    }

    @PutMapping("/{id}")
    public Professeur updateProfesseur(@PathVariable Long id, @RequestBody Professeur professeur) {
        return professeurService.updateProfesseur(id, professeur);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        professeurService.deleteProfesseur(id);
    }
}
