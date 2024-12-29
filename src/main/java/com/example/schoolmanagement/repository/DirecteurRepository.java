package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Directeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurRepository extends JpaRepository<Directeur, Long> {
    // No additional methods required for basic CRUD operations
}
