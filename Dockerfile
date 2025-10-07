# Use a lightweight JDK image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy compiled jar from Maven target folder
COPY target/simpleCalc-1.0-SNAPSHOT.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
