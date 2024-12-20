package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
