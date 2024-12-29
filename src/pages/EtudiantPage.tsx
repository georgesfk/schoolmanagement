import React from 'react';
import PageHeader from '../components/shared/PageHeader';
import Card from '../components/shared/Card';
import DataTable from '../components/shared/DataTable';
import'./EtudiantPage.css';
const EtudiantPage: React.FC = () => {
  return (
    <div>
      <PageHeader 
        title="Student Dashboard" 
        description="View your courses, grades, and schedule"
      />

      <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
        <Card title="Enrolled Courses">
          <DataTable
            columns={[
              { key: 'code', label: 'Code' },
              { key: 'name', label: 'Course' },
              { key: 'professor', label: 'Professor' },
            ]}
            data={[
              { code: 'CS101', name: 'Introduction to Programming', professor: 'Dr. Smith' },
              { code: 'MATH201', name: 'Calculus I', professor: 'Dr. Johnson' },
            ]}
          />
        </Card>

        <Card title="Recent Grades">
          <DataTable
            columns={[
              { key: 'course', label: 'Course' },
              { key: 'assignment', label: 'Assignment' },
              { key: 'grade', label: 'Grade' },
            ]}
            data={[
              { course: 'CS101', assignment: 'Midterm', grade: '85/100' },
              { course: 'MATH201', assignment: 'Quiz 2', grade: '90/100' },
            ]}
          />
        </Card>
      </div>
    </div>
  );
};

export default EtudiantPage;