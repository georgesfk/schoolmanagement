import { useState, useEffect } from 'react';
import { HomeIcon, UserIcon } from 'lucide-react';  // Importez uniquement les icônes dont vous avez besoin
import { StatItem } from '../types/admin';  // Importez le type StatItem depuis le bon fichier

export const useAdminStats = () => {
  const [stats, setStats] = useState<StatItem[] | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchStats = async () => {
      try {
        setLoading(true);
        const response = await fetch('/api/admin/stats');
        const data = await response.json();

        // Conversion des données récupérées en StatItem
        const formattedStats: StatItem[] = data.map((stat: any) => ({
          title: stat.name,   // Utilisez 'name' comme 'title'
          icon: stat.icon === 'home' ? HomeIcon : UserIcon, // Exemple de conversion de chaîne en icône
          value: stat.value.toString() // Convertir en chaîne
        }));

        setStats(formattedStats);
      } catch (err) {
        setError('Failed to fetch stats');
      } finally {
        setLoading(false);
      }
    };

    fetchStats();
  }, []); // Effectue une fois lorsque le composant est monté

  return { stats, loading, error };
};
