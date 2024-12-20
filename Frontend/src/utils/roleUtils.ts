export const getRoleBasedRoute = (role: string): string => {
  switch (role) {
    case 'admin':
      return '/admin';
    case 'directeur':
      return '/directeur';
    case 'professeur':
      return '/professeur';
    case 'etudiant':
      return '/etudiant';
    default:
      return '/login';
  }
};

export const getRoleLabel = (role: string): string => {
  switch (role) {
    case 'admin':
      return 'Administrator';
    case 'directeur':
      return 'Director';
    case 'professeur':
      return 'Professor';
    case 'etudiant':
      return 'Student';
    default:
      return role;
  }
};