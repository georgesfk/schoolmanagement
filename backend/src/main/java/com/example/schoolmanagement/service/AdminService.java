package com.example.schoolmanagement.service;

import com.example.schoolmanagement.model.Admin;
import com.example.schoolmanagement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Récupérer tous les administrateurs
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Récupérer un administrateur par son ID
    public Admin getAdminById(Long id) {
        Optional<Admin> admin = adminRepository.findById(id);
        return admin.orElse(null);
    }

    // Créer un nouvel administrateur
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Mettre à jour un administrateur existant
    public Admin updateAdmin(Long id, Admin admin) {
        if (adminRepository.existsById(id)) {
            admin.setId(id);  // On s'assure que l'ID est bien mis à jour
            return adminRepository.save(admin);
        }
        return null;
    }

    // Supprimer un administrateur
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}

