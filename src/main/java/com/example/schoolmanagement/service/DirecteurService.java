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

    // Récupérer tous les directeurs
    public List<Directeur> getAllDirecteurs() {
        return directeurRepository.findAll();
    }

    // Récupérer un directeur par son ID
    public Directeur getDirecteurById(Long id) {
        Optional<Directeur> directeur = directeurRepository.findById(id);
        return directeur.orElse(null);
    }

    // Créer un nouveau directeur
    public Directeur createDirecteur(Directeur directeur) {
        return directeurRepository.save(directeur);
    }

    // Mettre à jour un directeur existant
    public Directeur updateDirecteur(Long id, Directeur directeur) {
        if (directeurRepository.existsById(id)) {
            directeur.setId(id);  // On s'assure que l'ID du directeur est bien mis à jour
            return directeurRepository.save(directeur);
        }
        return null;
    }

    // Supprimer un directeur
    public void deleteDirecteur(Long id) {
        directeurRepository.deleteById(id);
    }
}

