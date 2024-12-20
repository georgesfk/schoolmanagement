package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Note;
import com.example.schoolmanagement.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    // Récupérer toutes les notes
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    // Récupérer une note par son ID
    public Note getNoteById(Long id) {
        Optional<Note> note = noteRepository.findById(id);
        return note.orElse(null);
    }

    // Créer une nouvelle note
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    // Mettre à jour une note existante
    public Note updateNote(Long id, Note note) {
        if (noteRepository.existsById(id)) {
            note.setId(id);  // On s'assure que l'ID est bien mis à jour
            return noteRepository.save(note);
        }
        return null;
    }

    // Supprimer une note
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}

