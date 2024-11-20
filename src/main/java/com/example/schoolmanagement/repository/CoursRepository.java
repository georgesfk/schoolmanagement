package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

