package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Note;
import com.example.schoolmanagement.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    // Obtenir toutes les notes
    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    // Obtenir une note par son ID
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    // Créer une nouvelle note
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    // Mettre à jour une note existante
    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        return noteService.updateNote(id, note);
    }

    // Supprimer une note
    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}

