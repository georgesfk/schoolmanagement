import { useState, useEffect } from 'react';
<<<<<<< HEAD
import { HomeIcon, UserIcon } from 'lucide-react';  // Importer les icônes nécessaires
import { StatItem } from '../types/admin';  // Type pour les statistiques
=======
import { HomeIcon, UserIcon } from 'lucide-react';  // Importez uniquement les icônes dont vous avez besoin
import { StatItem } from '../types/admin';  // Importez le type StatItem depuis le bon fichier
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f

export const useAdminStats = () => {
  const [stats, setStats] = useState<StatItem[] | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchStats = async () => {
      try {
        setLoading(true);
        const response = await fetch('/api/admin/stats');
<<<<<<< HEAD
        
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
=======
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
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f
      } finally {
        setLoading(false);
      }
    };

    fetchStats();
<<<<<<< HEAD
  }, []); // Effectuer l'appel API une seule fois au montage du composant
=======
  }, []); // Effectue une fois lorsque le composant est monté
>>>>>>> f552b6488b632e35937f7bfc194f91ec31f9da4f

  return { stats, loading, error };
};
