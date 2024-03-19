# Use a base image with Java and Maven pre-installed
FROM adoptopenjdk:11-jdk-hotspot AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the Spring Boot application
RUN ./mvnw package -DskipTests

# Create a new stage for the application runtime
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the server port
EXPOSE 9090

# Run the Spring Boot application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
