package com.example.schoolmanagement.model;

//import jakarta.persistence.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public User getTeacher() {
        return teacher;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @ManyToMany(mappedBy = "cours")
    private List<Etudiant> etudiants;

    // Getters et Setters
}
