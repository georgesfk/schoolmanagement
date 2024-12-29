# Phase de build avec Maven et OpenJDK 11
FROM maven:3.8-adoptopenjdk-11 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

# Ajout d'options de débogage pour Maven
RUN mvn clean package -DskipTests -X -e

# Phase d'exécution avec OpenJDK 11
FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /app/target/schoolmanagement-*.jar schoolmanagement.jar

CMD ["java", "-jar", "schoolmanagement.jar"]
