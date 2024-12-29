package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Cours;
import com.example.schoolmanagement.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    @Autowired
    private CoursService coursService;

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    @GetMapping("/{id}")
    public Cours getCoursById(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }

    @PutMapping("/{id}")
    public Cours updateCours(@PathVariable Long id, @RequestBody Cours cours) {
        return coursService.updateCours(id, cours);
    }

    @DeleteMapping("/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
    }
}
