package com.example.schoolmanagement.dto;

import java.util.Date;

public class ProfesseurDTO {
    private Long idProfesseur;
    private String nom;
    private String prenom;
    private String email;
    private String matiere;
    private Date dateEmbauche;
    private String role;
    private String statut;

    // Getters et Setters

    public Long getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(Long idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

