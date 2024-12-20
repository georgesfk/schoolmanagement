import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    port: 5174, // Assure-toi que ce port est libre
    open: true, // Ouvre automatiquement le navigateur lors du démarrage
  },
});
