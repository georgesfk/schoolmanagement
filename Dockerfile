
FROM maven:3.8.1-openjdk-11-slim AS build


WORKDIR /app


COPY . .


RUN mvn clean package

lication
FROM openjdk:11-jre-slim


COPY --from=build /app/target/schoolmanagement-1.0-SNAPSHOT.jar /app/schoolmanagement.jar


CMD ["java", "-jar", "/app/schoolmanagement.jar"]
