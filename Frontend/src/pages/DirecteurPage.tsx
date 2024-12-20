import React from 'react';
import PageHeader from '../components/shared/PageHeader';
import Card from '../components/shared/Card';
import DataTable from '../components/shared/DataTable';

const DirecteurPage: React.FC = () => {
  return (
    <div>
      <PageHeader 
        title="Director Dashboard" 
        description="Monitor academic performance and manage departments"
      />

      <div className="grid grid-cols-1 md:grid-cols-2 gap-6 mb-8">
        <Card title="Department Overview">
          <DataTable
            columns={[
              { key: 'department', label: 'Department' },
              { key: 'professors', label: 'Professors' },
              { key: 'students', label: 'Students' },
            ]}
            data={[
              { department: 'Computer Science', professors: 12, students: 150 },
              { department: 'Mathematics', professors: 8, students: 100 },
            ]}
          />
        </Card>

        <Card title="Performance Metrics">
          <div className="space-y-4">
            <div className="flex items-center justify-between">
              <span className="text-gray-600">Average GPA</span>
              <span className="font-semibold">3.5</span>
            </div>
            <div className="flex items-center justify-between">
              <span className="text-gray-600">Graduation Rate</span>
              <span className="font-semibold">92%</span>
            </div>
          </div>
        </Card>
      </div>
    </div>
  );
};

export default DirecteurPage;
