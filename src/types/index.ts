export interface User {
    id: string;
    name: string;
    email: string;
    role: 'student' | 'teacher' | 'admin';
  }
  
  export interface Course {
    id: string;
    title: string;
    description: string;
    instructor: string;
    credits: number;
  }
  
  export interface Grade {
    studentId: string;
    courseId: string;
    score: number;
    date: Date;
  }