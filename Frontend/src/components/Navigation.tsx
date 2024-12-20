import React from 'react';
import { Link } from 'react-router-dom';

const Navigation: React.FC = () => {
  return (
    <nav>
      <ul>
        <li><Link to="/">Admin</Link></li>
        <li><Link to="/directeur">Directeur</Link></li>
        <li><Link to="/professeur">Professeur</Link></li>
        <li><Link to="/etudiants">Étudiants</Link></li>
        <li><Link to="/cours">Cours</Link></li>
        <li><Link to="/notes">Notes</Link></li>
      </ul>
    </nav>
  );
};

export default Navigation;
