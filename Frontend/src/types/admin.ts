// src/types/admin.ts
import { LucideIcon } from 'lucide-react';  // Assurez-vous d'importer le bon type d'icône

export interface StatItem {
  title: string;
  icon: LucideIcon;  // Vous pouvez définir des icônes spécifiques selon votre utilisation
  value: string;
}
