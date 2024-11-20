package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

