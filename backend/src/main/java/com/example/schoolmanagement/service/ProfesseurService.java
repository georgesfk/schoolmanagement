package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Professeur;
import com.example.schoolmanagement.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurService {

    @Autowired
    private ProfesseurRepository professeurRepository;

    // Récupérer tous les professeurs
    public List<Professeur> getAllProfesseurs() {
        return professeurRepository.findAll();
    }

    // Récupérer un professeur par son ID
    public Professeur getProfesseurById(Long id) {
        Optional<Professeur> professeur = professeurRepository.findById(id);
        return professeur.orElse(null);
    }

    // Créer un nouveau professeur
    public Professeur createProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    // Mettre à jour un professeur existant
    public Professeur updateProfesseur(Long id, Professeur professeur) {
        // On ne définit pas manuellement l'ID. Il est déjà pris en compte par JPA.
        if (professeurRepository.existsById(id)) {
            // L'ID est récupéré de l'entité existante dans la base de données
            professeur.setId(id);  // Ceci est optionnel si l'ID est déjà dans l'objet professeur
            return professeurRepository.save(professeur);
        }
        return null;
    }

    // Supprimer un professeur
    public void deleteProfesseur(Long id) {
        professeurRepository.deleteById(id);
    }
}
