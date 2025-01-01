import React from 'react';
import PageHeader from '../components/shared/PageHeader';
import Card from '../components/shared/Card';
import DataTable from '../components/shared/DataTable';

const GradesPage: React.FC = () => {
  return (
    <div>
      <PageHeader 
        title="Grade Management" 
        description="View and manage student grades"
      />

      <Card title="Grade Overview">
        <DataTable
          columns={[
            { key: 'student', label: 'Student' },
            { key: 'course', label: 'Course' },
            { key: 'assignment', label: 'Assignment' },
            { key: 'grade', label: 'Grade' },
            { key: 'date', label: 'Submission Date' },
          ]}
          data={[
            { 
              student: 'John Doe',
              course: 'CS101',
              assignment: 'Midterm',
              grade: '85/100',
              date: '2024-03-10'
            },
            { 
              student: 'Jane Smith',
              course: 'MATH201',
              assignment: 'Final Exam',
              grade: '92/100',
              date: '2024-03-15'
            },
          ]}
        />
      </Card>
    </div>
  );
};

export default GradesPage;