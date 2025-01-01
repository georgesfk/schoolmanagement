package com.example.schoolmanagement.dto;

import java.util.Date;

public class EtudiantDTO {
    private Long idEtudiant;
    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    private String sexe;
    private Long idCours;

    // Getters et Setters

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Long getIdCours() {
        return idCours;
    }

    public void setIdCours(Long idCours) {
        this.idCours = idCours;
    }
}

