package com.example.schoolmanagement.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private Directeur directeur;

    @ManyToMany
    @JoinTable(
            name = "cours_professeur",
            joinColumns = @JoinColumn(name = "cours_id"),
            inverseJoinColumns = @JoinColumn(name = "professeur_id")
    )
    private List<Professeur> professeurs;

    @OneToMany(mappedBy = "cours", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Etudiant> etudiants;

    @OneToMany(mappedBy = "cours", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Note> notes;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public List<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
