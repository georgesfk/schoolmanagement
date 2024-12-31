<<<<<<< HEAD
import axios, { InternalAxiosRequestConfig } from 'axios';
=======
import axios from 'axios';
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f

// Créer une instance d'Axios avec des configurations de base
const instance = axios.create({
  baseURL: '/api', // Avec un proxy configuré dans vite.config.ts
<<<<<<< HEAD
  timeout: 10000,   // Délai d'attente pour les requêtes (en millisecondes)
=======
  timeout: 10000, // Délai d'attente pour les requêtes (en millisecondes)
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f
  headers: {
    'Content-Type': 'application/json',
  },
});

// Ajouter un interceptor pour les requêtes
instance.interceptors.request.use(
<<<<<<< HEAD
  (config: InternalAxiosRequestConfig) => {
    // Ajout d'un token d'authentification si disponible
    const token = localStorage.getItem('token');
    if (token && config.headers) {
=======
  (config) => {
    // Ajout d'un token d'authentification si disponible
    const token = localStorage.getItem('token');
    if (token) {
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

// Ajouter un interceptor pour les réponses
instance.interceptors.response.use(
  (response) => response,
  (error) => {
    // Gestion des erreurs globales
    if (error.response?.status === 401) {
      console.error('Utilisateur non autorisé');
      // Rediriger vers la page de connexion, par exemple
      // window.location.href = '/login'; // Décommenter si nécessaire
    }
    return Promise.reject(error);
  }
);

export default instance;
