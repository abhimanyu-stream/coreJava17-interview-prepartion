# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy Maven wrapper files and pom.xml
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Install project dependencies
RUN ./mvnw dependency:resolve

# Copy source code into the image
COPY src ./src

# Specify the command to run when the container starts
CMD ["./mvnw", "spring-boot:run"]
