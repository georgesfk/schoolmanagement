package com.example.schoolmanagement.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.lang.NonNull;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        // Cette ligne permet d'accepter toutes les requêtes depuis le frontend React (localhost:5173)
        registry.addMapping("/**") // Autoriser toutes les requêtes vers le backend
                .allowedOrigins("http://localhost:8080") // L'adresse du frontend React par défaut (Vite utilise le port 5173)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Les méthodes HTTP autorisées
    }
}
