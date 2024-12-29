import React, { useState, useEffect } from 'react';
import { useAdminStats } from '../hooks/useAdminStats'; // Importer le hook qui gère les statistiques
import'./AdminPage.css';
const AdminPage: React.FC = () => {
  const [activities, setActivities] = useState<string[]>([]); // Exemple d'état pour les activités
  const { stats, loading, error } = useAdminStats(); // Utiliser le hook pour récupérer les stats

  useEffect(() => {
    // Si vous avez une API pour récupérer les activités, vous pouvez l'utiliser ici
    const fetchActivities = async () => {
      const response = await fetch('/api/activities');
      const data = await response.json();
      setActivities(data); // Mettre à jour l'état des activités
    };

    fetchActivities(); // Appel pour récupérer les activités
  }, []); // Cela ne se déclenche qu'une seule fois lorsque le composant est monté

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error loading stats: {error}</div>;

  return (
    <div>
      <h1>Admin Dashboard</h1>
      
      <h2>Statistics</h2>
      <div>
        {stats?.map((stat, index) => (
          <div key={index}>
            <h3>{stat.title}</h3>
            <p>{stat.value}</p>
          </div>
        ))}
      </div>

      <h2>Activities</h2>
      <div>
        {activities.length === 0 ? (
          <p>No activities available.</p>
        ) : (
          activities.map((activity, index) => <div key={index}>{activity}</div>)
        )}
      </div>
    </div>
  );
};

export default AdminPage;
