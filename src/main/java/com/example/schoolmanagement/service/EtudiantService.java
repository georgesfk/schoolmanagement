package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Etudiant;
import com.example.schoolmanagement.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    // Récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    // Récupérer un étudiant par son ID
    public Etudiant getEtudiantById(Long id) {
        Optional<Etudiant> etudiant = etudiantRepository.findById(id);
        return etudiant.orElse(null);
    }

    // Créer un nouvel étudiant
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    // Mettre à jour un étudiant existant
    public Etudiant updateEtudiant(Long id, Etudiant etudiant) {
        if (etudiantRepository.existsById(id)) {
            etudiant.setId(id);  // On s'assure que l'ID est bien mis à jour
            return etudiantRepository.save(etudiant);
        }
        return null;
    }

    // Supprimer un étudiant
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}

