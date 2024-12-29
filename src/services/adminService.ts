import { Activity, StatItem } from '../types/admin';
import { Users, BookOpen, GraduationCap } from 'lucide-react';

export const adminService = {
  async getActivities(): Promise<Activity[]> {
    // TODO: Replace with actual API call when backend is ready
    return [
      { date: '2024-03-15', user: 'John Doe', action: 'Created new course' },
      { date: '2024-03-14', user: 'Jane Smith', action: 'Updated grades' },
    ];
  },

  async getStats(): Promise<StatItem[]> {
    // TODO: Replace with actual API call when backend is ready
    return [
      { title: 'Total Users', value: '250', icon: Users },
      { title: 'Active Courses', value: '15', icon: BookOpen },
      { title: 'Total Students', value: '180', icon: GraduationCap },
    ];
  }
};