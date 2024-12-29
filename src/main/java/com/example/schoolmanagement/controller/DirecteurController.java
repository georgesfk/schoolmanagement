package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Directeur;
import com.example.schoolmanagement.service.DirecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/directeurs")
public class DirecteurController {

    @Autowired
    private DirecteurService directeurService;

    // Get all Directeurs
    @GetMapping
    public List<Directeur> getAllDirecteurs() {
        return directeurService.getAllDirecteurs();
    }

    // Get Directeur by ID
    @GetMapping("/{id}")
    public ResponseEntity<Directeur> getDirecteurById(@PathVariable Long id) {
        Optional<Directeur> directeur = directeurService.getDirecteurById(id);

        if (directeur.isPresent()) {
            return ResponseEntity.ok(directeur.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create a new Directeur
    @PostMapping
    public Directeur createDirecteur(@RequestBody Directeur directeur) {
        return directeurService.createDirecteur(directeur);
    }

    // Update an existing Directeur
    @PutMapping("/{id}")
    public ResponseEntity<Directeur> updateDirecteur(@PathVariable Long id, @RequestBody Directeur directeur) {
        Optional<Directeur> updatedDirecteur = directeurService.updateDirecteur(id, directeur);

        if (updatedDirecteur.isPresent()) {
            return ResponseEntity.ok(updatedDirecteur.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a Directeur
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDirecteur(@PathVariable Long id) {
        boolean isDeleted = directeurService.deleteDirecteur(id);

        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
