import axios, { InternalAxiosRequestConfig } from 'axios';

// Créer une instance d'Axios avec des configurations de base
const instance = axios.create({
  baseURL: '/api', // Avec un proxy configuré dans vite.config.ts
  timeout: 10000,   // Délai d'attente pour les requêtes (en millisecondes)
  headers: {
    'Content-Type': 'application/json',
  },
});

// Ajouter un interceptor pour les requêtes
instance.interceptors.request.use(
  (config: InternalAxiosRequestConfig) => {
    // Ajout d'un token d'authentification si disponible
    const token = localStorage.getItem('token');
    if (token && config.headers) {
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
