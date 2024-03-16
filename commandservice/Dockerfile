FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app

# Copy the Maven wrapper scripts and Maven project descriptor
COPY pom.xml .

# Fetch dependencies
RUN mvn dependency:go-offline

COPY src ./src

# Build the application
RUN mvn package -DskipTests

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/commandservice-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]