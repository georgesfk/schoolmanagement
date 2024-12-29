package com.example.schoolmanagement.configuration;



//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Cette ligne permet d'accepter toutes les requêtes depuis le frontend React (localhost:5173)
        registry.addMapping("/**") // Autoriser toutes les requêtes vers le backend
                .allowedOrigins("http://localhost:5173") // L'adresse du frontend React par défaut (Vite utilise le port 5173)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Les méthodes HTTP autorisées
    }
}

