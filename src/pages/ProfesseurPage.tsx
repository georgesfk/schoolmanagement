import React from 'react';
import PageHeader from '../components/shared/PageHeader';
import Card from '../components/shared/Card';
import DataTable from '../components/shared/DataTable';
import'./ProfesseurPage.css';
const ProfesseurPage: React.FC = () => {
  return (
    <div>
      <PageHeader 
        title="Professor Dashboard" 
        description="Manage your courses and student grades"
      />

      <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
        <Card title="My Courses">
          <DataTable
            columns={[
              { key: 'code', label: 'Code' },
              { key: 'name', label: 'Course Name' },
              { key: 'students', label: 'Students' },
            ]}
            data={[
              { code: 'CS101', name: 'Introduction to Programming', students: 35 },
              { code: 'CS202', name: 'Data Structures', students: 28 },
            ]}
          />
        </Card>

        <Card title="Upcoming Classes">
          <DataTable
            columns={[
              { key: 'time', label: 'Time' },
              { key: 'course', label: 'Course' },
              { key: 'room', label: 'Room' },
            ]}
            data={[
              { time: '09:00 AM', course: 'CS101', room: 'Room 201' },
              { time: '11:00 AM', course: 'CS202', room: 'Room 305' },
            ]}
          />
        </Card>
      </div>
    </div>
  );
};

export default ProfesseurPage;