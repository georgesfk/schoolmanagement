package com.example.schoolmanagement.model;

//import jakarta.persistence.*;

import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valeur;

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValeur(Double valeur) {
        this.valeur = valeur;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Double getValeur() {
        return valeur;
    }

    public Cours getCours() {
        return cours;
    }

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;

    // Getters et Setters
}
