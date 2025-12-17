FROM maven:3.9.6-amazoncorretto-21-al2023 AS build
LABEL authors="munashenzira"
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests


FROM amazoncorretto:21.0.2-al2023-headless
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]