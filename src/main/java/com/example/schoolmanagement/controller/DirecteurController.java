package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Directeur;
import com.example.schoolmanagement.service.DirecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directeurs")
public class DirecteurController {

    @Autowired
    private DirecteurService directeurService;

    // Obtenir tous les directeurs
    @GetMapping
    public List<Directeur> getAllDirecteurs() {
        return directeurService.getAllDirecteurs();
    }

    // Obtenir un directeur par son ID
    @GetMapping("/{id}")
    public Directeur getDirecteurById(@PathVariable Long id) {
        return directeurService.getDirecteurById(id);
    }

    // Créer un nouveau directeur
    @PostMapping
    public Directeur createDirecteur(@RequestBody Directeur directeur) {
        return directeurService.createDirecteur(directeur);
    }

    // Mettre à jour un directeur existant
    @PutMapping("/{id}")
    public Directeur updateDirecteur(@PathVariable Long id, @RequestBody Directeur directeur) {
        return directeurService.updateDirecteur(id, directeur);
    }

    // Supprimer un directeur
    @DeleteMapping("/{id}")
    public void deleteDirecteur(@PathVariable Long id) {
        directeurService.deleteDirecteur(id);
    }
}

