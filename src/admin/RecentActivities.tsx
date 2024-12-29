import React from 'react';
import Card from '../shared/Card';
import DataTable from '../shared/DataTable';
import { Activity } from '../types/admin';

interface RecentActivitiesProps {
  activities: Activity[];
}

export const RecentActivities: React.FC<RecentActivitiesProps> = ({ activities }) => {
  const columns = [
    { key: 'date', label: 'Date' },
    { key: 'user', label: 'User' },
    { key: 'action', label: 'Action' },
  ];

  return (
    <Card title="Recent Activities">
      <DataTable columns={columns} data={activities} />
    </Card>
  );
};