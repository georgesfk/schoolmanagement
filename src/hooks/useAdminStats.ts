import { useState, useEffect } from 'react';
import { HomeIcon, UserIcon } from 'lucide-react';  // Importer les icônes nécessaires
import { StatItem } from '../types/admin';  // Type pour les statistiques

export const useAdminStats = () => {
  const [stats, setStats] = useState<StatItem[] | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchStats = async () => {
      try {
        setLoading(true);
        const response = await fetch('/api/admin/stats');
        
        // Vérification de la validité de la réponse avant de la traiter
        if (!response.ok) {
          throw new Error(`API call failed with status: ${response.status}`);
        }
        
        const data = await response.json();

        // S'assurer que les données sont dans le bon format
        if (!Array.isArray(data)) {
          throw new Error('Invalid data format');
        }

        // Conversion des données récupérées en StatItem
        const formattedStats: StatItem[] = data.map((stat: any) => ({
          title: stat.name || 'Untitled',   // Utiliser 'name' comme 'title'
          icon: stat.icon === 'home' ? HomeIcon : UserIcon, // Convertir l'icône
          value: stat.value ? stat.value.toString() : '0' // Conversion sécurisée
        }));

        setStats(formattedStats);
      } catch (err: any) {
        // Plus de détails sur l'erreur
        setError(`Failed to fetch stats: ${err.message}`);
      } finally {
        setLoading(false);
      }
    };

    fetchStats();
  }, []); // Effectuer l'appel API une seule fois au montage du composant

  return { stats, loading, error };
};
