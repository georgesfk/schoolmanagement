package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

