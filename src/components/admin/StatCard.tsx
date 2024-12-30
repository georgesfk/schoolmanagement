import React from 'react';
import Card from '../shared/Card';
import { StatItem } from '../../types/admin';

interface StatCardProps {
  stat: StatItem;
}

export const StatCard: React.FC<StatCardProps> = ({ stat }) => {
  const Icon = stat.icon;
  
  return (
    <Card title={stat.title} className="text-center">
      <div className="flex items-center justify-center">
        <Icon className="h-8 w-8 text-indigo-600 mb-2" />
      </div>
      <p className="text-3xl font-bold text-gray-900">{stat.value}</p>
    </Card>
  );
};