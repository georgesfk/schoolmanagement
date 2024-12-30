import { RouteObject } from 'react-router-dom';
import { ROUTES } from './paths';

// Pages
import Admin from '../pages/AdminPage';
import Directeur from '../pages/DirecteurPage';
import Professeur from '../pages/ProfesseurPage';
import Etudiants from '../pages/EtudiantPage';
import Cours from '../pages/CoursPage';
import Notes from '../pages/NotesPage';

export const routes: RouteObject[] = [
  {
    path: ROUTES.HOME,
    element: <Admin />,
  },
  {
    path: ROUTES.DIRECTOR,
    element: <Directeur />,
  },
  {
    path: ROUTES.TEACHER,
    element: <Professeur />,
  },
  {
    path: ROUTES.STUDENTS,
    element: <Etudiants />,
  },
  {
    path: ROUTES.COURSES,
    element: <Cours />,
  },
  {
    path: ROUTES.GRADES,
    element: <Notes />,
  },
];