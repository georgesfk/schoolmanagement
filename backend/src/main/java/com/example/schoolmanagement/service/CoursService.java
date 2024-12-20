package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Cours;
import com.example.schoolmanagement.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    // Récupérer tous les cours
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    // Récupérer un cours par son ID
    public Cours getCoursById(Long id) {
        Optional<Cours> cours = coursRepository.findById(id);
        return cours.orElse(null);
    }

    // Créer un nouveau cours
    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    // Mettre à jour un cours existant
    public Cours updateCours(Long id, Cours cours) {
        if (coursRepository.existsById(id)) {
            cours.setId(id);  // On s'assure que l'ID est bien mis à jour
            return coursRepository.save(cours);
        }
        return null;
    }

    // Supprimer un cours
    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }
}

