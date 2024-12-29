// src/components/admin/StatsOverview.tsx
import React from 'react';
import { StatCard } from './StatCard';
import { StatItem } from '../types/admin';  // Assurez-vous que StatItem est bien importé

interface StatsOverviewProps {
  stats: StatItem[];
}

export const StatsOverview: React.FC<StatsOverviewProps> = ({ stats }) => {
  return (
    <div className="grid grid-cols-1 md:grid-cols-3 gap-6 mb-8">
      {stats.map((stat, index) => (
        <StatCard key={index} stat={stat} />
      ))}
    </div>
  );
};
