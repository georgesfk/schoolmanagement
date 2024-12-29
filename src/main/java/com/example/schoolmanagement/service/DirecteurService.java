package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Directeur;
import com.example.schoolmanagement.repository.DirecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirecteurService {

    @Autowired
    private DirecteurRepository directeurRepository;

    // Get all Directeurs
    public List<Directeur> getAllDirecteurs() {
        return directeurRepository.findAll();  // This returns a List<Directeur>
    }

    // Get Directeur by ID
    public Optional<Directeur> getDirecteurById(Long id) {
        return directeurRepository.findById(id);  // This returns an Optional<Directeur>
    }

    // Create a new Directeur
    public Directeur createDirecteur(Directeur directeur) {
        return directeurRepository.save(directeur);  // Save and return the created Directeur
    }

    // Update an existing Directeur
    public Optional<Directeur> updateDirecteur(Long id, Directeur directeur) {
        Optional<Directeur> existingDirecteur = directeurRepository.findById(id);
        if (existingDirecteur.isPresent()) {
            directeur.setId(id);  // Ensure the ID is preserved during the update
            return Optional.of(directeurRepository.save(directeur));  // Return the updated Directeur
        }
        return Optional.empty();  // Return Optional.empty() if not found
    }

    // Delete a Directeur
    public boolean deleteDirecteur(Long id) {
        Optional<Directeur> directeur = directeurRepository.findById(id);
        if (directeur.isPresent()) {
            directeurRepository.delete(directeur.get());  // Delete the found Directeur
            return true;  // Return true if deletion is successful
        }
        return false;  // Return false if the Directeur was not found
    }
}
