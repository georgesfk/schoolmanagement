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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID généré automatiquement par la base de données
    private Long id;

    private String username;
    private String password;

    // Constructeur sans argument
    public User() {}

    // Constructeur avec tous les arguments
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    // Le setter pour l'ID n'est généralement pas nécessaire si l'ID est généré automatiquement
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
