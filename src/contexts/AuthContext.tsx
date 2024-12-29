import React, { createContext, useContext, useState, ReactNode } from 'react';

interface User {
  id: string;
  role: 'admin' | 'directeur' | 'professeur' | 'etudiant';
  name: string;
}

interface AuthContextType {
  user: User | null;
  login: (username: string, password: string) => Promise<void>;
  logout: () => void;
}

const AuthContext = createContext<AuthContextType | null>(null);

export const useAuth = () => {
  const context = useContext(AuthContext);
  if (!context) {
    throw new Error('useAuth must be used within an AuthProvider');
  }
  return context;
};

export const AuthProvider: React.FC<{ children: ReactNode }> = ({ children }) => {
  const [user, setUser] = useState<User | null>(null);

  // Fonction login qui utilise username et password
  const login = async (username: string, password: string) => {
    // Remplacer par un appel API réel
    if (username === 'admin' && password === 'password123') {
      const mockUser: User = {
        id: '1',
        role: 'admin',
        name: 'Admin User',
      };
      setUser(mockUser);
    } else {
      throw new Error('Invalid credentials');
    }
  };

  const logout = () => {
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ user, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
};
