import React from 'react';
import { Outlet, useNavigate } from 'react-router-dom';
import { LogOut, Menu } from 'lucide-react';
import { useAuth } from '../contexts/AuthContext';

const PageLayout: React.FC = () => {
  const { user, logout } = useAuth();
  const navigate = useNavigate();

  const handleLogout = () => {
    logout();
    navigate('/login');
  };

  return (
    <div className="min-h-screen bg-gray-50">
      <nav className="bg-white shadow-lg">
        <div className="max-w-7xl mx-auto px-4">
          <div className="flex justify-between h-16">
            <div className="flex items-center">
              <Menu className="h-6 w-6 text-gray-600" />
              <span className="ml-2 text-xl font-semibold text-gray-800">
                School Management
              </span>
            </div>
            <div className="flex items-center">
              <span className="mr-4 text-gray-600">
                Welcome, {user?.name}
              </span>
              <button
                onClick={handleLogout}
                className="flex items-center text-gray-600 hover:text-gray-800"
              >
                <LogOut className="h-5 w-5 mr-1" />
                Logout
              </button>
            </div>
          </div>
        </div>
      </nav>
      <main className="max-w-7xl mx-auto py-6 px-4">
        <Outlet />
      </main>
    </div>
  );
};

export default PageLayout;