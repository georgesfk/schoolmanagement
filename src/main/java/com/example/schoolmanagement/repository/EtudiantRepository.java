package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

