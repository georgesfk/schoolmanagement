package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Cours;
import com.example.schoolmanagement.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    @Autowired
    private CoursService coursService;

    // Obtenir tous les cours
    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    // Obtenir un cours par son ID
    @GetMapping("/{id}")
    public Cours getCoursById(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }

    // Créer un nouveau cours
    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }

    // Mettre à jour un cours existant
    @PutMapping("/{id}")
    public Cours updateCours(@PathVariable Long id, @RequestBody Cours cours) {
        return coursService.updateCours(id, cours);
    }

    // Supprimer un cours
    @DeleteMapping("/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
    }
}

