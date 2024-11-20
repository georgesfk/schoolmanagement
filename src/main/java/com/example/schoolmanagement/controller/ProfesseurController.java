package com.example.schoolmanagement.controller;

//import com.example.schoolmanagement.model.Professeur;
//import com.example.schoolmanagement.service.ProfesseurService;
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

    // Obtenir tous les professeurs
    @GetMapping
    public List<Professeur> getAllProfesseurs() {
        return professeurService.getAllProfesseurs();
    }

    // Obtenir un professeur par son ID
    @GetMapping("/{id}")
    public Professeur getProfesseurById(@PathVariable Long id) {
        return professeurService.getProfesseurById(id);
    }

    // Créer un nouveau professeur
    @PostMapping
    public Professeur createProfesseur(@RequestBody Professeur professeur) {
        return professeurService.createProfesseur(professeur);
    }

    // Mettre à jour un professeur existant
    @PutMapping("/{id}")
    public Professeur updateProfesseur(@PathVariable Long id, @RequestBody Professeur professeur) {
        return professeurService.updateProfesseur(id, professeur);
    }

    // Supprimer un professeur
    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        professeurService.deleteProfesseur(id);
    }
}
