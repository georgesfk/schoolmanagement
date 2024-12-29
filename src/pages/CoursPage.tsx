import React from 'react';
import PageHeader from '../components/shared/PageHeader';
import Card from '../components/shared/Card';
import DataTable from '../components/shared/DataTable';
import { Course } from '../types/course';
import'./CoursPage.css';
const CoursPage: React.FC = () => {
  const courses: Course[] = [
    { 
      code: 'CS101', 
      name: 'Introduction to Programming', 
      department: 'Computer Science',
      professor: 'Dr. Smith',
      students: 35
    },
    { 
      code: 'MATH201', 
      name: 'Calculus I', 
      department: 'Mathematics',
      professor: 'Dr. Johnson',
      students: 42
    },
  ];

  const handleCourseClick = (course: Course) => {
    console.log('Course clicked:', course);
  };

  return (
    <div>
      <PageHeader 
        title="Course Management" 
        description="View and manage all courses"
      />

      <Card title="All Courses">
        <DataTable<Course>
          columns={[
            { key: 'code', label: 'Code' },
            { key: 'name', label: 'Course Name' },
            { key: 'department', label: 'Department' },
            { key: 'professor', label: 'Professor' },
            { key: 'students', label: 'Enrolled Students' },
          ]}
          data={courses}
          onRowClick={handleCourseClick}
        />
      </Card>
    </div>
  );
};

export default CoursPage;