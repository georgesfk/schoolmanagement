package com.example.schoolmanagement.dto;

import java.util.Date;

public class DirecteurDTO {
    private Long idDirecteur;
    private String nom;
    private String prenom;
    private String email;
    private String role;
    private Date dateCreation;
    private Date dateNomination;

    // Getters et Setters

    public Long getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(Long idDirecteur) {
        this.idDirecteur = idDirecteur;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateNomination() {
        return dateNomination;
    }

    public void setDateNomination(Date dateNomination) {
        this.dateNomination = dateNomination;
    }
}

