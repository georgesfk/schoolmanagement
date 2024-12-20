package com.example.schoolmanagement.service;

import com.example.schoolmanagement.exception.UserNotFoundException;
import com.example.schoolmanagement.model.User;
import com.example.schoolmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Récupérer tous les utilisateurs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Récupérer un utilisateur par son ID
    public User getUserById(Long id) {
        // Si l'utilisateur n'est pas trouvé, lever une exception UserNotFoundException
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found"));
    }

    // Créer un nouvel utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Mettre à jour un utilisateur existant
    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);  // On s'assure que l'ID de l'utilisateur est bien mis à jour
            return userRepository.save(user);
        }
        return null;  // Retourne null si l'utilisateur n'existe pas
    }

    // Supprimer un utilisateur
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
