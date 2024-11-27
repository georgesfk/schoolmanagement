# Utilisation de l'image de base Java 11
FROM maven:3.8.1-openjdk-11-slim AS build

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers du projet
COPY . .

# Compiler le projet Maven
RUN mvn clean package

# Utilisation de l'image OpenJDK pour exécuter l'application
FROM openjdk:11-jre-slim

# Copier le fichier JAR généré
COPY --from=build /app/target/schoolmanagement-1.0-SNAPSHOT.jar /app/schoolmanagement.jar

# Commande pour exécuter l'application
CMD ["java", "-jar", "/app/schoolmanagement.jar"]
