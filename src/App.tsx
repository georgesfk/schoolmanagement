import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Navigation from './components/Navigation';

// Pages
import Admin from './pages/AdminPage';
import Directeur from './pages/DirecteurPage';
import Professeur from './pages/ProfesseurPage';
import Etudiants from './pages/EtudiantPage';
import Cours from './pages/CoursPage';
import Notes from './pages/NotesPage';

const Layout: React.FC<{ children: React.ReactNode }> = ({ children }) => (
  <>
    <Navigation />
    <main>{children}</main>
  </>
);

const App: React.FC = () => (
  <Router>
    <Routes>
      <Route path="/" element={<Layout><Admin /></Layout>} />
      <Route path="/directeur" element={<Layout><Directeur /></Layout>} />
      <Route path="/professeur" element={<Layout><Professeur /></Layout>} />
      <Route path="/etudiants" element={<Layout><Etudiants /></Layout>} />
      <Route path="/cours" element={<Layout><Cours /></Layout>} />
      <Route path="/notes" element={<Layout><Notes /></Layout>} />
      <Route path="*" element={<Layout><div>Page non trouvée</div></Layout>} />
    </Routes>
  </Router>
);

export default App;
