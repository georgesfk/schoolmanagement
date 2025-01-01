package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Directeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirecteurRepository extends JpaRepository<Directeur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}

