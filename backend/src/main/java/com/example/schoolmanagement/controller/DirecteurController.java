package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Directeur;
import com.example.schoolmanagement.service.DirecteurService;
import com.example.schoolmanagement.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        Optional<Directeur> directeurOptional = directeurService.getDirecteurById(id);
        if (directeurOptional.isPresent()) {
            return directeurOptional.get(); // Retourne le directeur si trouvé
        } else {
            throw new UserNotFoundException("Directeur not found with id: " + id); // Lance une exception 404 si non trouvé
        }
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
