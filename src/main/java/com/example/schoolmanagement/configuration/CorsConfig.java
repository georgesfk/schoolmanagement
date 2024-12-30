package com.example.schoolmanagement.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // Permettre l'envoi des cookies
<<<<<<< HEAD
        config.setAllowedOrigins(Arrays.asList("http://localhost:5173")); // Origine autorisée
=======
        config.setAllowedOrigins(Arrays.asList("http://localhost:3000")); // Origine autorisée
>>>>>>> 6241463d6357f1f4fdab2efe380f170e60527170
        config.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization"));
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        source.registerCorsConfiguration("/**", config); // Applique à tous les endpoints
        return new CorsFilter(source);
    }
}

