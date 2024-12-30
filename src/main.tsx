import React from 'react';
import ReactDOM from 'react-dom/client'; // Si vous utilisez React 18+ avec ReactDOM.createRoot
import App from './App'; // Assurez-vous que le chemin est correct
import './index.css'; // Optionnel, si vous avez un fichier CSS global

// Crée un "root" et monte l'application
const root = ReactDOM.createRoot(document.getElementById('root') as HTMLElement);
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
