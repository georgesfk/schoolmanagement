package com.example.schoolmanagement.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // L'ID est généré automatiquement
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String matiere;

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getRole() {
        return role;
    }

    private String role;

    // Constructeurs, getters et setters

    public Long getId() {
        return id;
    }

    // Pas besoin de setId si l'ID est généré automatiquement par la base de données.
    // Si vous souhaitez l'utiliser, vous pouvez toujours garder la méthode setId().

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Autres getters et setters
}
