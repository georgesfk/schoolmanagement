import React from 'react';
import './Footer.css'; // Ajoutez les styles si nécessaires

const Footer: React.FC = () => (
  <footer className="footer">
    <div className="footer__info">
      <h3>École Sacré Cœur</h3>
      <p>123 Mina,Byblos,Liban, </p>
      <p>📞 </p>
      <p>✉️ contact@ecolesacrecoeur.fr</p>
    </div>
    <div className="footer__map">
      <h4>Nous trouver</h4>
      <iframe
        src="https://maps.app.goo.gl/hNkdpJLYPJGtzLLX8"
        width="100%"
        height="200"
        style={{ border: 0 }}
        allowFullScreen
        loading="lazy"
        referrerPolicy="no-referrer-when-downgrade"
        title="Carte de localisation de l'École Sacré Cœur"
      ></iframe>
    </div>
    <div className="footer__copyright">
      <p>&copy; {new Date().getFullYear()} École Sacré Cœur. Tous droits réservés.</p>
    </div>
  </footer>
);

export default Footer;
