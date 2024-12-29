import React from 'react';
import './Header.css'; // Fichier CSS pour les styles

const Header: React.FC = () => (
  <header className="header">
    <div className="header__logo">
      <img src="/logo.png" alt="École Sacré Cœur" />
    </div>
    <div className="header__title">
      <h1>École Sacré Cœur</h1>
      <p>“Éduquer pour un avenir meilleur”</p>
    </div>
    <nav className="header__nav">
      <ul>
        <li><a href="/">Accueil</a></li>
        <li><a href="/about">À propos</a></li>
        <li><a href="/admissions">Admissions</a></li>
        <li><a href="/contact">Contact</a></li>
      </ul>
    </nav>
    <div className="header__contact">
      <a href="tel:+33123456789">📞 01 23 45 67 89</a>
    </div>
  </header>
);

export default Header;
